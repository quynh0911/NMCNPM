/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import models.Hop_dong;
import models.Phong;
import Algothirm.Event;

/**
 *
 * @author DucQuyet
 */
public class ThuePhong {

    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
    PreparedStatement preparedStatement = null;
//  thêm hợp đồng

    public boolean addHopDong(Hop_dong hopdong) throws SQLException, ClassNotFoundException {
        connection = MySQLConnection1.getMysqlConnection();
        String sql = "insert into hopdong(idhopdong,tenkhachhang,sodienthoai,diachi,soCMT,batdau,ketthuc"
                + ",chiphi,datcoc,idphong,trangthai,thanhtoan) values(?,?,?,?,?,?,?,?,?,?,?,?)";
        

        preparedStatement = connection.prepareCall(sql);
        
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
        preparedStatement.setBoolean(11, hopdong.isTrangthai());
        preparedStatement.setBoolean(12, hopdong.isThanhtoan());
        preparedStatement.execute();
        return true;
    }
//  thay đổi phòng

    public boolean updateHopDong(int idHopDong, int idPhong) throws SQLException, ClassNotFoundException {
        connection = MySQLConnection1.getMysqlConnection();
        String sql = "update hopdong set idphong = ? where idhopdong = ?";
        
        preparedStatement = connection.prepareCall(sql);
        
        preparedStatement.setInt(1, idPhong);
     
        preparedStatement.setInt(2, idHopDong);
        
        preparedStatement.execute();
        return true;
        
    }
//  thay đổi thời gian thuê

    public boolean updateHopDong(int idHopDong, Timestamp batdau, Timestamp ketthuc) throws ClassNotFoundException, SQLException {
        connection = MySQLConnection1.getMysqlConnection();
        String sql = "update hopdong set batdau = ? , ketthuc = ?  where idhopdong = ?";
        preparedStatement = connection.prepareCall(sql);
        preparedStatement.setTimestamp(1, batdau);
        preparedStatement.setTimestamp(2, ketthuc);
        preparedStatement.execute();
        return true;
    }

//  kiểm tra hợp đồng có được chấp nhận hay không

    public boolean checkTrangThai(int idHopDong) throws SQLException, ClassNotFoundException {
        connection = MySQLConnection1.getMysqlConnection();
        Hop_dong hopdong;
        String sql = "select * from hopdong where idhopdong = ?";

        preparedStatement = connection.prepareCall(sql);
        preparedStatement.setInt(1, idHopDong);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            hopdong = new Hop_dong(resultSet.getInt("idhopdong"),
                    resultSet.getString("tenkhachhang"),
                    resultSet.getString("sodienthoai"),
                    resultSet.getString("diachi"), 
                    resultSet.getString("soCMT"),
                    resultSet.getTimestamp("batdau"),
                    resultSet.getTimestamp("ketthuc"),
                    resultSet.getInt("chiphi"),
                    resultSet.getInt("datcoc"),
                    resultSet.getInt("idphong"),
                    resultSet.getBoolean("trangthai"),
                    resultSet.getBoolean("thanhtoan")
                    );
            return hopdong.isTrangthai();
        }
        return false;
    }
    
//  kiểm tra hợp đồng thanh toán hay chưa

    public boolean checkThanhToan(int idHopDong) throws SQLException, ClassNotFoundException {
        connection = MySQLConnection1.getMysqlConnection();
        Hop_dong hopdong;
        String sql = "select * from hopdong where idhopdong = ?";
        preparedStatement = connection.prepareCall(sql);
        preparedStatement.setInt(1, idHopDong);
        resultSet = preparedStatement.executeQuery();
        resultSet.next();
        return resultSet.getBoolean("thanhtoan");
    }
    
//  xóa hợp đồng

    public boolean deleteHopDong(int idHopDong) throws SQLException, ClassNotFoundException {
        connection = MySQLConnection1.getMysqlConnection();
        String sql = "delete from hopdong where idhopdong = ?";
        
        preparedStatement = connection.prepareCall(sql);
        
        preparedStatement.setInt(1 , idHopDong);
        
        preparedStatement.execute();
        return true;
    }
//  lấy danh sách hợp đồng

    public List<Hop_dong> getAll() throws SQLException, ClassNotFoundException {
        List<Hop_dong> danhsachhopdong = new ArrayList<>();
        connection = MySQLConnection1.getMysqlConnection();
        String sql = "select * from hopdong";
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            Hop_dong hopdong = new Hop_dong(resultSet.getInt("idhopdong"),
                    resultSet.getString("tenkhachhang"),
                    resultSet.getString("sodienthoai"),
                    resultSet.getString("diachi"),
                    resultSet.getString("soCMT"),
                    resultSet.getTimestamp("batdau"),
                    resultSet.getTimestamp("ketthuc"),
                    resultSet.getInt("chiphi"),
                    resultSet.getInt("datcoc"),
                    resultSet.getInt("idphong"),
                    resultSet.getBoolean("trangthai"),
                    resultSet.getBoolean("thanhtoan")
                    );
            danhsachhopdong.add(hopdong);
        }
        return danhsachhopdong;
    }
    
    
    public List<Event> danhsachhopdong() throws SQLException, ClassNotFoundException {
        List<Event> danhsachhopdong = new ArrayList<>();
        connection = MySQLConnection1.getMysqlConnection();
        String sql = "select * from hopdong";
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            Event event = new Event(
                    resultSet.getTimestamp("batdau"),
                    resultSet.getTimestamp("ketthuc"),
                    resultSet.getInt("idphong")
                    );
            danhsachhopdong.add(event);
        }
        return danhsachhopdong;
    }
    
}
