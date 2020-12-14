/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algothirm;

import com.sun.glass.ui.SystemClipboard;
import java.sql.Timestamp;

/**
 *
 * @author hien
 */

public class Event{
    Timestamp startTime;
    Timestamp endTime;
    int idPhong;
    

    public Event(Timestamp startTime, Timestamp endTime, int idPhong) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.idPhong = idPhong;
    }

    @Override
    public String toString() {
        return "Event{" + "startTime=" + startTime + ", endTime=" + endTime + ", idPhong=" + idPhong + '}';
    }

    
    
    
    
    
    
    public static void main(String[] args) {
        
    }

   

   
}
