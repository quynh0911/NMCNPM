/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.QuanLyNVH;


//import Bean.HoatDongBean;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.*;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import models.HopDong;
import services.HoatDongService;
import utility.TableHoatDongCanXetDuyet;
import utility.TableHoatDongDaDuyet;

//import model.HoatDongModel;
//import sevices.HoatDongService;
//import uility.TableModelHoatDong;
import views.infoViews.InfoJframe;

/**
 *
 * @author Quynh0911
 */
public class HoatDongPanelController {
    private JPanel jPanel;
    private List<HopDong> list = new ArrayList<>();
    private HoatDongService hoatDongService ;
    private TableHoatDongDaDuyet tableHoatDongDaDuyet;
    private final String [] COLUMNS = {"ID Hoạt động","Tên Khách hàng", "Địa chỉ", "Số CMT", "Số ĐT", "ID Phòng thuê","thời điểm bắt đầu", "Thời điểm kết thúc"};
    public HoatDongPanelController(JPanel jPanel) throws SQLException, ClassNotFoundException{
        hoatDongService = new HoatDongService();
        this.tableHoatDongDaDuyet = new TableHoatDongDaDuyet();
        this.list = hoatDongService.getHopDong();
        this.jPanel = jPanel;    
    }
    public HoatDongPanelController(){
    
    }
    
    public JPanel getjPanel() {
        return jPanel;
    }

    public void setjPanel(JPanel jPanel) {
        this.jPanel = jPanel;
    }
    public void setDataTable() {
        List<HopDong> listItem = new ArrayList<>();
        this.list.forEach(hopDong -> {
            listItem.add(hopDong);
        });
        DefaultTableModel model = tableHoatDongDaDuyet.setTableHoatDongDaDuyet(listItem, COLUMNS);
        JTable table = new JTable(model);
        
        // thiet ke bang
        
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        table.getTableHeader().setPreferredSize(new Dimension(100, 50));
        table.setRowHeight(50);
        table.validate();
        table.repaint();
        table.setFont(new Font("Arial", Font.PLAIN, 14));
        //table.getColumnModel().getColumn(0).setMaxWidth(80);
        //table.getColumnModel().getColumn(0).setMinWidth(80);
        //table.getColumnModel().getColumn(0).setPreferredWidth(80);
        
        JScrollPane scroll = new JScrollPane();
        scroll.getViewport().add(table);
        scroll.setPreferredSize(new Dimension(1350, 400));
        jPanel.removeAll();
        jPanel.setLayout(new CardLayout());
        jPanel.add(scroll);
        jPanel.validate();
        jPanel.repaint();
    }

   // public void setParentJFrame(JFrame parentJFrame) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}

}
