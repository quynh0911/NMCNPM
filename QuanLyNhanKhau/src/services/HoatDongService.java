/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

//import com.mysql.jdbc.MySQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.HopDong;
import services.MysqlConnection;

/**
 *
 * @author Admin
 */
public class HoatDongService {

    public HoatDongService() {
       
    }
     public boolean addHoatDong(HopDong hopdong)  {
        try{
        Connection connection = MysqlConnection.getMysqlConnection();
        String sql = "insert into hopdong(idhopdong,tenkhachhang,sodienthoai,diachi,soCMT,batdau,ketthuc"
                + ",chiphi,datcoc,idphong,trangthai,thanhtoan) values(?,?,?,?,?,?,?,?,?,?,0,0)";
        
        PreparedStatement preparedStatement = connection.prepareCall(sql);
        
        preparedStatement.setInt(1, hopdong.getIdHopDong());
        preparedStatement.setString(2, hopdong.getTenKhachHang());
        preparedStatement.setString(3, hopdong.getSoDienThoai());
        preparedStatement.setString(4, hopdong.getDiaChi());
        preparedStatement.setString(5, hopdong.getSoCMT());
        preparedStatement.setTimestamp(6, hopdong.getStart());
        preparedStatement.setTimestamp(7, hopdong.getEnd());
        preparedStatement.setInt(8, hopdong.getChiPhiThue());
        preparedStatement.setInt(9, hopdong.getPhiDatCoc());
        preparedStatement.setInt(10, hopdong.getIdPhong());
       // preparedStatement.setBoolean(11, hopdong.isTrangthai());
       // preparedStatement.setBoolean(12, hopdong.isThanhtoan());
        preparedStatement.execute();
        } catch(SQLException e){
            
        }
        catch(ClassNotFoundException ex){
            
        }
        return true;
    }
    public List<HopDong> getAll(){
        List<HopDong> danhsachhopdong = new ArrayList<>();
        try{
        Connection connection = MysqlConnection.getMysqlConnection();
        String sql = "select * from hopdong";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            HopDong hopdong = new HopDong(resultSet.getInt("idhopdong"),
                    resultSet.getString("tenkhachhang"),
                    resultSet.getString("sodienthoai"),
                    resultSet.getString("diachi"),
                    resultSet.getString("soCMT"),
                    resultSet.getTimestamp("batdau"),
                    resultSet.getTimestamp("ketthuc"),
                    resultSet.getInt("chiphi"),
                    resultSet.getInt("datcoc"),
                    resultSet.getInt("Idphong"),
                    resultSet.getInt("trangthai"),
                    resultSet.getInt("thanhtoan")
                    );
            danhsachhopdong.add(hopdong);
        }
    }
     catch(SQLException e){
            
        }
        catch(ClassNotFoundException ex){
            
        }
        return danhsachhopdong;
    }
    public List<HopDong> getDanhSachCanXetDuyet()  {
        List<HopDong> danhsachhoatDong = new ArrayList<>();
      //  try{
        Connection connection;
        try {
            connection = MysqlConnection.getMysqlConnection();
       
        String sql1 = "select * from hopdong where trangthai = 0";
        Statement statement = connection.createStatement();
       
        ResultSet resultSet = statement.executeQuery(sql1);
        while (resultSet.next()) {
            HopDong hopdong = new HopDong(resultSet.getInt("idhopdong"),
                    resultSet.getString("tenkhachhang"),
                    resultSet.getString("sodienthoai"),
                    resultSet.getString("diachi"),
                    resultSet.getString("soCMT"),
                    resultSet.getTimestamp("batdau"),
                    resultSet.getTimestamp("ketthuc"),
                    resultSet.getInt("chiphi"),
                    resultSet.getInt("datcoc"),
                    resultSet.getInt("Idphong"),
                    0, 
                    0
                   // resultSet.getInt("trangthai"),
                    //resultSet.getInt("thanhtoan")
                    );
            danhsachhoatDong.add(hopdong);
        }
         } catch (SQLException ex) {
            Logger.getLogger(HoatDongService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HoatDongService.class.getName()).log(Level.SEVERE, null, ex);
        }
//        } catch(SQLException e){
//            
//        }
//        catch(ClassNotFoundException ex){
//            
//        }
        return danhsachhoatDong;
    }
    public List<HopDong> getHopDong()   {
        List<HopDong> danhsachhopdong = new ArrayList<>();
        try{
        
        Connection connection = MysqlConnection.getMysqlConnection();
        String sql = "select * from hopdong where trangthai = 1 ";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            HopDong hopdong = new HopDong(resultSet.getInt("idhopdong"),
                    resultSet.getString("tenkhachhang"),
                    resultSet.getString("sodienthoai"),
                    resultSet.getString("diachi"),
                    resultSet.getString("soCMT"),
                    resultSet.getTimestamp("batdau"),
                    resultSet.getTimestamp("ketthuc"),
                    resultSet.getInt("chiphi"),
                    resultSet.getInt("datcoc"),
                    resultSet.getInt("Idphong"),
                    1,
                    0
                    //resultSet.getBoolean("trangthai"),
                    //resultSet.getBoolean("thanhtoan")
                    );
            danhsachhopdong.add(hopdong);
        }
        } catch(SQLException e){
            
        }
        catch(ClassNotFoundException ex){
            
        }
        return danhsachhopdong;
    }
    
    public HopDong getHopDongById(String id) throws SQLException, ClassNotFoundException{
       
        HopDong hopdong;
        
        Connection   connection = MysqlConnection.getMysqlConnection();
       
        String sql = "select * from hopdong where idhopdong =" + id;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        
        hopdong = new HopDong(resultSet.getInt("idhopdong"),
                    resultSet.getString("tenkhachhang"),
                    resultSet.getString("sodienthoai"),
                    resultSet.getString("diachi"),
                    resultSet.getString("soCMT"),
                    resultSet.getTimestamp("batdau"),
                    resultSet.getTimestamp("ketthuc"),
                    resultSet.getInt("chiphi"),
                    resultSet.getInt("datcoc"),
                    resultSet.getInt("Idphong"),
                    resultSet.getInt("trangthai"),
                    resultSet.getInt("thanhtoan")
            );
                
        return hopdong;
    }
}
