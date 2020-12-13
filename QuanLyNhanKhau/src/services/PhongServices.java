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
import java.util.ArrayList;
import java.util.List;
import models.Phong;

/**
 * getAll, checkPhongTrong, layDanhSachPhongTrong, updateTrangThai
 *
 * @author DucQuyet
 */
//        trangthai == 0 đang được sử dụng
//        trangthai != 0 đang trống
public class PhongServices {

    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
    PreparedStatement preparedStatement = null;

//    lấy danh sách phòng trong nhà văn hóa
    public List<Phong> getAll() throws SQLException, ClassNotFoundException {
        List<Phong> danhsachPhong = new ArrayList<>();

        connection = MySQLConnection.getMysqlConnection();
        String sql = "select * from phong";
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            Phong phong;
            phong = new Phong(resultSet.getInt("idphong"), resultSet.getString("ten"), resultSet.getString("vitri"),
                    resultSet.getInt("dientich"), resultSet.getBoolean("trangthai"), resultSet.getString("mota"));
            danhsachPhong.add(phong);
        }
        return danhsachPhong;
    }

//    lấy danh sách phòng trống
    public List<Phong> danhsachphongtrong() throws SQLException, ClassNotFoundException {
        List<Phong> danhsachPhong = new ArrayList<>();

        connection = MySQLConnection.getMysqlConnection();

        String sql = "select * from phong where trangthai != 0";

        statement = connection.createStatement();
        resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            Phong phong;
            phong = new Phong(resultSet.getInt("idphong"), resultSet.getString("ten"), resultSet.getString("vitri"),
                    resultSet.getInt("dientich"), resultSet.getBoolean("trangthai"), resultSet.getString("mota"));
            danhsachPhong.add(phong);
        }
        return danhsachPhong;
    }

//    kiểm tra phòng trống
    public boolean kiemtraphongtrong(int idphong) throws SQLException, ClassNotFoundException {

        connection = MySQLConnection.getMysqlConnection();

        String sql = "select * from phong where idphong = ?";

        preparedStatement = connection.prepareCall(sql);
        preparedStatement.setInt(1, idphong);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Phong phong;
            phong = new Phong(resultSet.getInt("idphong"), resultSet.getString("ten"), resultSet.getString("vitri"),
                    resultSet.getInt("dientich"), resultSet.getBoolean("trangthai"), resultSet.getString("mota"));
            if (phong.isTrangThai()) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

//    update trạng thái của phòng trống -> được sử dụng
//    có thể update ngược lại
    public void updatetrangthai(int idphong) throws SQLException, ClassNotFoundException {
        boolean t = kiemtraphongtrong(idphong);
        if(t){
            connection = MySQLConnection.getMysqlConnection();
            String sql = "update phong set trangthai = 0 where idphong = ?";
            preparedStatement = connection.prepareCall(sql);
            preparedStatement.setInt(1, idphong);
            preparedStatement.execute();
        }else{
            connection = MySQLConnection.getMysqlConnection();
            String sql = "update phong set trangthai = 1 where idphong = ?";
            preparedStatement = connection.prepareCall(sql);
            preparedStatement.setInt(1, idphong);
            preparedStatement.execute();
        }
    }
}
