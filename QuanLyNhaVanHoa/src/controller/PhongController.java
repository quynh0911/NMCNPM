/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Phong;
import services.PhongServices;

/**
 *
 * @author DucQuyet
 */
public class PhongController {
    public PhongServices phongservices = new PhongServices();
    public List<Phong> danhsachphong;
    
//   danh sách phòng còn trống
    public List<Phong> danhsachphongtrong() throws SQLException{
        try {
            danhsachphong = phongservices.danhsachphongtrong();
            return danhsachphong;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PhongController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
//    kiểm tra trạng thái của một phòng
    public boolean kiemtratrangthai(int id) throws SQLException, ClassNotFoundException{
        return phongservices.kiemtraphongtrong(id);
    }
//    update trạng thái của một phòng
    public void thaydoitrangthai(int id) throws SQLException, ClassNotFoundException{
        phongservices.updatetrangthai(id);
    }
}
