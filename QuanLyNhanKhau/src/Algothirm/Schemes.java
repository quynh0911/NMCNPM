/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algothirm;
import java.util.ArrayList;
import java.util.List;
import Algothirm.Event;
import java.sql.SQLException;
import java.sql.Timestamp;
import models.Hop_dong;
import services.ThuePhong;

/**
 *
 * @author hien
 */


public class Schemes {
    
    final int extra_time = 15*60;
    
    public static long getDistance(Timestamp time1, Timestamp time2){
        long distance = time1.getTime() - time2.getTime();
        return distance;
    }
    
    public List<Event> danhsachhopdong() throws SQLException, ClassNotFoundException{
        List<Event> list = new ThuePhong().danhsachhopdong();
        return list;
    }
    
    boolean is_not_over_lap(Event event1, Event event2){
        if(event1.idPhong != event2.idPhong){
            return true;
        }
        long distance1 = getDistance(event1.startTime , event2.endTime);
        if(distance1 - extra_time > 0){
            return true;
        }
        long distance2 = getDistance(event1.endTime, event2.startTime);
        if(distance2 + extra_time <0){
            return true;
        }
        return false;
    }
    
    public boolean add_event(Event new_event) throws SQLException, ClassNotFoundException{
        List<Event> list_events = danhsachhopdong();
        for (Event event: list_events){
            if(is_not_over_lap(event, new_event)){
            } else {
                return false;
            } 
        }
        list_events.add(new_event);
        return true;
    }
    
    public static void main(String args[]) throws SQLException, ClassNotFoundException{
        List<Event> events = new Schemes().danhsachhopdong();
        for(Event e : events){
            System.out.println(e);
        }
    }
    
}
