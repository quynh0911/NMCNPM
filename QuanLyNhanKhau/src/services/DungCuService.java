/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

/**
 *
 * @author quynh0911
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.DungCuModel;

@SuppressWarnings("InitializerMayBeStatic")

public class DungCuService {
    public List<DungCuModel> getDanhSachDungCu() {
        List<DungCuModel> danhSachThietBi =  new ArrayList<>();
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String sql = "SELECT * FROM Thietbi";
            PreparedStatement prst1 = connection.prepareStatement(sql);
            ResultSet rs1 = prst1.executeQuery();
            while (rs1.next()){
                DungCuModel dungCuModel = new DungCuModel();
                dungCuModel.setIdThietBi(rs1.getString("idthietbi"));
                dungCuModel.setTenThietBi(rs1.getString("tenthietbi"));
                dungCuModel.setSoLuong(rs1.getInt("soluong"));
                dungCuModel.setKhaDung(rs1.getInt("khadung"));
                dungCuModel.setMoTa(rs1.getString("mota"));
                danhSachThietBi.add(dungCuModel);
            }
            prst1.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return danhSachThietBi;
    }
    public List<DungCuModel> capNhatDungCu(int tongSoBan,int soBanKhaDung, int tongSoGhe, int soGheKhaDung, int tongSoMayChieu, int soMayKhaDung){
        List <DungCuModel> DSThietBiCapNhat = new ArrayList<>();
        try{
            Connection connection = MysqlConnection.getMysqlConnection();
            String query1 = "UPDATE thietbi SET soluong = "
                          + tongSoBan 
                          +", khadung = "
                          + soBanKhaDung
                          +" FROM thietbi where idthietbi = BAN01";
            PreparedStatement preparedStatement1 = connection.prepareStatement(query1);
            String query2 = "UPDATE thietbi SET soluong = "
                          + tongSoGhe 
                          +", khadung = "
                          + soGheKhaDung
                          +" FROM thietbi where idthietbi = GHE01";
            PreparedStatement preparedStatement2 = connection.prepareStatement(query2);
            String query3 = "UPDATE thietbi SET soluong = "
                          + tongSoMayChieu 
                          +", khadung = "
                          + soMayKhaDung
                          +" FROM thietbi where idthietbi = MAYCHIEU01";
            PreparedStatement preparedStatement3 = connection.prepareStatement(query3);
            
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return DSThietBiCapNhat;
    }
}
