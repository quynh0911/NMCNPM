/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhavanhoa;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.Hop_dong;
import models.Phong;
import models.Thiet_bi;
import services.PhongServices;
import services.ThietBiService;
import services.ThuePhong;

/**
 *
 * @author DucQuyet
 */
public class QuanLyNhaVanHoa {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
        List<Hop_dong> list = new ArrayList<>();
        ThuePhong thuePhong = new ThuePhong();
        list = thuePhong.getAll();
        System.out.println(list);
        
    }
    
}
