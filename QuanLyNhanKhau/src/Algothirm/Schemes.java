/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algothirm;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
import java.sql.Timestamp;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import models.HopDong;
import services.HoatDongService;
//import services.ThuePhong;

/**
 *
 * @author hien
 */


public class Schemes {
    
    final long extra_time = 15;
    
     
    public static long getDistance(Timestamp time1, Timestamp time2){
        long distance = time1.getTime() - time2.getTime();
        return distance / 60000;
    }
    
    public List<HopDong> danhsachhopdong() throws SQLException, ClassNotFoundException{
        List<HopDong> list;
        HoatDongService service = new HoatDongService();
        list = service.getAll();
        return list;
    }
    
    
         
         
    boolean is_not_overlap(HopDong event1, HopDong event2){
         if(event1.getIdPhong() != event2.getIdPhong()){
            return true;
        }
        long distance1 = getDistance(event1.getStart() , event2.getEnd());
        if(distance1 - extra_time < 0){
            return false;
        }
        long distance2 = getDistance(event1.getEnd(), event2.getStart());
        if(distance2 + extra_time > 0){
            return false;
        }
        return true;
    }
    
    
    
    
    public boolean add_event(HopDong new_event) throws SQLException, ClassNotFoundException{
        List<HopDong> list_events = danhsachhopdong();
       // boolean kt = true;
        for (HopDong event: list_events){
            if(is_not_overlap(event, new_event)){
            } else {
               // kt = false;
                JFrame frame = new JFrame("Thông báo");
                JOptionPane.showMessageDialog(frame, "Thời gian bị trùng!","Error", JOptionPane.ERROR_MESSAGE);
                return false;
            } 
        }        
            HoatDongService hoatDongCanXet = new HoatDongService();
            hoatDongCanXet.addHoatDong(new_event);
            return true;
    
    }
    
}
