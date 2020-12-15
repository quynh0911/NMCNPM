/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.DungCuModel;

/**
 *
 * @author Admin
 */
public class TableModelDungCu {

    public DefaultTableModel setTableModelDungCu (List<DungCuModel> danhSachDungCu, String[] listColumn1){
        final int numOfCols = listColumn1.length;
        DefaultTableModel tableModelDungCu = new DefaultTableModel(){
            @Override 
            public boolean isCellEditable(int row, int column) {
                return super.isCellEditable(row, column); //To change body of generated methods, choose Tools | Templates.
            }
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 3 ? Boolean.class : String.class;
            }
        };
        tableModelDungCu.setColumnIdentifiers(listColumn1);
        Object [] obj1;
        obj1 = new Object [numOfCols];
        danhSachDungCu.forEach((DungCuModel dungCu) -> {
            obj1[0] = dungCu.getTenThietBi();
            obj1[1] = dungCu.getSoLuong();
            obj1[2] = dungCu.getKhaDung();
            tableModelDungCu.addRow(obj1);
        });
        return tableModelDungCu;
    }
}
