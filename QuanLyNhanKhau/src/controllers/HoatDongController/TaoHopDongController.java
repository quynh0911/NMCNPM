/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.HoatDongController;

import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import models.HopDong;
import services.HoatDongService;


/**
 *
 * @author Admin
 */
public class TaoHopDongController {
  HoatDongService hoatDong = new HoatDongService();    
  public void ShownDuLieu(JTable jTable2) {
     
        jTable2.removeAll();
        String [] arr = {"ID Hợp đồng", "Tên khách hàng", "ID Phòng", "Bắt đầu", "kết thúc"};
        DefaultTableModel model = new DefaultTableModel (arr, 0);
       
        List<HopDong> DSHopDong = hoatDong.getHopDong();
        for (HopDong s : DSHopDong){
            Vector vector = new Vector();
            vector.add(s.getIdHopDong());
            vector.add(s.getTenKhachHang());
            vector.add(s.getIdPhong());
            vector.add(s.getStart());
            vector.add(s.getEnd());
            model.addRow(vector);
        }
        jTable2.setModel(model);
    } 
      
}  
  

