/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import models.HopDong;

/**
 *
 * @author Admin
 */
public class TableHoatDongDaDuyet {

    public TableHoatDongDaDuyet() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    public DefaultTableModel setTableHoatDongDaDuyet (List<HopDong> danhSachHoatDong, String[] listColumn1){
        final int numOfCols = listColumn1.length;
        DefaultTableModel tableHoatDongDaDuyet = new DefaultTableModel(){
            @Override 
            public boolean isCellEditable(int row, int column) {
                return super.isCellEditable(row, column); //To change body of generated methods, choose Tools | Templates.
            }
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 10 ? Boolean.class : String.class;
            }
        };
        tableHoatDongDaDuyet.setColumnIdentifiers(listColumn1);
        Object [] obj1;
        obj1 = new Object [numOfCols];
        danhSachHoatDong.forEach((HopDong hoatDong) -> {
            obj1[0] = hoatDong.getIdHopDong();
            obj1[1] = hoatDong.getTenKhachHang();
            obj1[2] = hoatDong.getDiaChi();
            obj1[3] = hoatDong.getSoCMT();
            obj1[4] = hoatDong.getSoDienThoai();
            obj1[5] = hoatDong.getIdPhong();
          // obj1[6] = hoatDong.getChiPhiThue();
          // obj1[] = hoatDong.getPhiDatCoc();
            obj1[6] = hoatDong.getStart();
            obj1[7] = hoatDong.getEnd();
            tableHoatDongDaDuyet.addRow(obj1);
        });
        return tableHoatDongDaDuyet;
    }
}
