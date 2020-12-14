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
import models.Thiet_bi;

/**
 * addNew, findByidThietbi, getAll, delete, updateSoluong, updateKhadung
 * @author DucQuyet
 */
public class ThietBiService {
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
    PreparedStatement preparedStatement = null;
//    thêm thiết bị vào nhà văn hóa

    public boolean themthietbi(Thiet_bi thietbi) throws SQLException, ClassNotFoundException {
        connection = MySQLConnection1.getMysqlConnection();
        String sql = "insert into thietbi(idthietbi,tenthietbi,soluong,khadung,mota) values(?,?,?,?,?)";
        
        preparedStatement = connection.prepareCall(sql);
        
        preparedStatement.setString(1, thietbi.getIDthietbi());
        preparedStatement.setString(2, thietbi.getTenThietBi());
        preparedStatement.setInt(3, thietbi.getSoLuong());
        preparedStatement.setInt(4, thietbi.getKhaDung());
        preparedStatement.setString(5, thietbi.getMoTa());
        
        preparedStatement.execute();
        return true;
    }
//    điều chỉnh số lượng - updateSoLuong

    public boolean updateSoLuong(int soluong ,String idthietbi) throws SQLException, ClassNotFoundException {
        connection = MySQLConnection1.getMysqlConnection();
        String sql = "update thietbi set soluong = ? where idthietbi = ?";
        
        preparedStatement = connection.prepareCall(sql);
        
        preparedStatement.setInt(1, soluong);
     
        preparedStatement.setString(2, idthietbi);
        
        preparedStatement.execute();
        return true;
        
    }
//    điều chỉnh khả dụng - update tính khả dung // loại bỏ những thiết bị hỏng

    public boolean updateKhaDung(int soluong ,String idthietbi) throws SQLException, ClassNotFoundException {
        connection = MySQLConnection1.getMysqlConnection();
        String sql = "update thietbi set khadung = ? where idthietbi = ?";
        
        preparedStatement = connection.prepareCall(sql);
        
        preparedStatement.setInt(1, soluong);
     
        preparedStatement.setString(2, idthietbi);
        
        preparedStatement.execute();
        return true;
    }
    
//    xóa thiết bị khỏi CSDL của nhà văn hóa

    public boolean deleteThietBi(String idThietBi) throws SQLException, ClassNotFoundException {
        connection = MySQLConnection1.getMysqlConnection();
        String sql = "delete from thietbi where idthietbi = ?";
        
        preparedStatement = connection.prepareCall(sql);
        
        preparedStatement.setString(1 , idThietBi);
        
        preparedStatement.execute();
        return true;
    }
//    lấy danh sách tất cả các thiết bị của nhà văn hóa

    public List<Thiet_bi> getAll() throws SQLException, ClassNotFoundException {
        List<Thiet_bi> danhsachthietbi = new ArrayList<>();

        connection = MySQLConnection1.getMysqlConnection();
        String sql = "select * from thietbi";

        statement = connection.createStatement();

        resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            Thiet_bi thiet_bi;
            thiet_bi = new Thiet_bi(resultSet.getString("idthietbi"),
                    resultSet.getString("tenthietbi"),
                    resultSet.getInt("soluong"),
                    resultSet.getInt("khadung"),
                    resultSet.getString("mota")
            );

            danhsachthietbi.add(thiet_bi);

        }

        return danhsachthietbi;
    }
    
//    tìm thiết bị theo ID

    public Thiet_bi findByidThietBi(String idThietBi) throws SQLException, ClassNotFoundException {
        Thiet_bi thiet_bi = new Thiet_bi();
        connection = MySQLConnection1.getMysqlConnection();
        String sql = "select * from thietbi where idthietbi = ?";
        
        
        preparedStatement = connection.prepareCall(sql);

        preparedStatement.setString(1, idThietBi);
        resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            thiet_bi = new Thiet_bi(resultSet.getString("idthietbi"),
                    resultSet.getString("tenthietbi"),
                    resultSet.getInt("soluong"),
                    resultSet.getInt("khadung"),
                    resultSet.getString("mota")
            );
        }
        return thiet_bi;
    }

}
