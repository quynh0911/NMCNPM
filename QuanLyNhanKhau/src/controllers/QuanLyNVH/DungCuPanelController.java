package controllers.QuanLyNVH;


import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.DungCuModel;
import services.DungCuService;
import utility.TableModelDungCu;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class DungCuPanelController {
    private JPanel jPanel;
    private List<DungCuModel> list = new ArrayList<>();
    private DungCuService dungCuService ;
    private TableModelDungCu tableModelDungCu;
    private final String [] COLUMNS = { "Tên thiết bị", "Số lượng", "Khả dụng"};
    public DungCuPanelController(JPanel jPanel){
        dungCuService = new DungCuService();
        this.tableModelDungCu = new TableModelDungCu();
        this.list = dungCuService.getDanhSachDungCu();
        this.jPanel = jPanel;
    }

    public DungCuPanelController() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public JPanel getjPanel() {
        return jPanel;
    }

    public void setjPanel(JPanel jPanel) {
        this.jPanel = jPanel;
    }
    public void setDataTable() {
        List<DungCuModel> listItem = new ArrayList<>();
        this.list.forEach(dungCu -> {
            listItem.add(dungCu);
        });
        DefaultTableModel model = tableModelDungCu.setTableModelDungCu(listItem, COLUMNS);
        JTable table = new JTable(model);
        
        // thiet ke bang
        
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        table.getTableHeader().setPreferredSize(new Dimension(100, 50));
        table.setRowHeight(50);
        table.validate();
        table.repaint();
        table.setFont(new Font("Arial", Font.PLAIN, 14));
       // table.getColumnModel().getColumn(0).setMaxWidth(80);
       // table.getColumnModel().getColumn(0).setMinWidth(80);
       // table.getColumnModel().getColumn(0).setPreferredWidth(80);
        
        JScrollPane scroll = new JScrollPane();
        scroll.getViewport().add(table);
        scroll.setPreferredSize(new Dimension(1350, 400));
        jPanel.removeAll();
        jPanel.setLayout(new CardLayout());
        jPanel.add(scroll);
        jPanel.validate();
        jPanel.repaint();
    }

    //public void setParentJFrame(JFrame parentJFrame) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}

}
