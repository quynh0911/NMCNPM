
package controllers.DungCuController;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.DungCuModel;
import services.DungCuService;

/**
 *
 * @author Admin
 */
public class KiemKeController {
  
    DungCuService hoatDong = new DungCuService();    
    public void ShownDuLieu(JTable jTable2) {
     
        jTable2.removeAll();
        String [] arr = {"ID thiết bị", "Tên thiết bị", "Tổng số", "khả dụng"};
        DefaultTableModel model = new DefaultTableModel (arr, 0);
       
        List<DungCuModel> DSThietBi = hoatDong.getDanhSachDungCu();
        for (DungCuModel s : DSThietBi){
            Vector vector = new Vector();
            vector.add(s.getIdThietBi());
            vector.add(s.getTenThietBi());
            vector.add(s. getSoLuong());
            vector.add(s.getKhaDung());
           // vector.add(s.getEnd());
            model.addRow(vector);
        }
        jTable2.setModel(model);
        
    } 
}
