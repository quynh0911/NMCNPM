/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.HoatDong;

import Algothirm.Schemes;
import controllers.HoatDongController.DangKyController;
import controllers.QuanLyNVH.HoatDongCanXetDuyetPanelController;
import controllers.QuanLyNVH.HoatDongPanelController;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import models.HopDong;

/**
 *
 * @author M6800
 */
public class DangKyJFrame extends javax.swing.JFrame {

    /**
     * Creates new form DangKyJFrame
     */
    private HoatDongPanelController parentController;
    private JFrame parentFrame;
    //private NhanKhauBean nhanKhauBean;
    private DangKyController controller;
    
    public DangKyJFrame(HoatDongPanelController parentController, JFrame parentJFrame) {
        this.parentController = parentController;
        this.parentFrame = parentJFrame;
        this.parentFrame.setEnabled(false);
        //this.nhanKhauBean = new NhanKhauBean();
        initComponents();
        setTitle("Đăng ký sử dụng nhà văn hóa");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        controller = new DangKyController();
        
        this.addWindowListener(new WindowAdapter() {
            //@Override
            public void windowClosing(WindowEvent e) {
                if (JOptionPane.showConfirmDialog(null, "Are you sure to close??", "Warning!!", JOptionPane.YES_NO_OPTION) == 0) {
                    close();
                }
            }
            
        });
    }
    
    public DangKyJFrame(JFrame parentJFrame) {
        this.parentController = new HoatDongPanelController(){
            //@Override
            public void refreshData() {
                // do nothing
            }

            //@Override
            public void initAction() {
                // do nothing
            }
            
            
        };
        this.parentFrame = parentJFrame;
        this.parentFrame.setEnabled(false);
        //this.nhanKhauBean = new NhanKhauBean();
        initComponents();
        setTitle("Thêm mới nhân khẩu");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        controller = new DangKyController();
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                if (JOptionPane.showConfirmDialog(null, "Are you sure to close??", "Warning!!", JOptionPane.YES_NO_OPTION) == 0) {
                    close();
                }
            }
            
        });
    }
    
    void close() {
        this.parentFrame.setEnabled(true);
        dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ThoiGianBatDau = new javax.swing.JTextField();
        ThoiGianKetThuc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tenKhachHang = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        SoCMT = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        IdHopDong = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        IdPhong = new javax.swing.JTextField();
        DiaChi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SoDienThoai = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("ĐĂNG KÝ SỬ DỤNG NHÀ VĂN HOÁ");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Mã phòng: ");

        ThoiGianBatDau.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ThoiGianBatDau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThoiGianBatDauActionPerformed(evt);
            }
        });

        ThoiGianKetThuc.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ThoiGianKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThoiGianKetThucActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Họ và tên: ");

        tenKhachHang.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jButton2.setText("Huỷ");

        jButton3.setText("Gửi đăng ký");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Số CMT:");

        SoCMT.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SoCMT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoCMTActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setText("Mã hoạt động");

        IdHopDong.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        IdHopDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdHopDongActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Nguyên quán:");

        IdPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdPhongActionPerformed(evt);
            }
        });

        DiaChi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        DiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiaChiActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Thời gian:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Số ĐT:");

        SoDienThoai.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SoDienThoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoDienThoaiActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Bắt đầu:");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("Kết thúc:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(171, 171, 171))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel15)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(0, 0, 0)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(IdHopDong, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(59, 59, 59)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(jLabel12)
                                                .addGap(18, 18, 18)
                                                .addComponent(ThoiGianKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(18, 18, 18)
                                                .addComponent(IdPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(24, 24, 24))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addGap(18, 18, 18)
                                                .addComponent(ThoiGianBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(SoCMT, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6)
                                        .addGap(53, 53, 53)
                                        .addComponent(SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(40, 40, 40)
                .addComponent(jButton3)
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(SoCMT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(IdHopDong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(IdPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(ThoiGianBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(ThoiGianKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ThoiGianBatDauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThoiGianBatDauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ThoiGianBatDauActionPerformed

    private void ThoiGianKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThoiGianKetThucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ThoiGianKetThucActionPerformed

    private void SoCMTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoCMTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SoCMTActionPerformed

    private void IdPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdPhongActionPerformed

    private void DiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiaChiActionPerformed

    private void SoDienThoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoDienThoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SoDienThoaiActionPerformed
    Schemes scheme = new Schemes();
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        HopDong hoatDong = new HopDong();
        //SimpleDateFormat dinhdangDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        hoatDong.setIdPhong(Integer.parseInt(IdPhong.getText()));
        hoatDong.setSoDienThoai(SoDienThoai.getText());
        hoatDong.setTenKhachHang(tenKhachHang.getText());
        hoatDong.setSoCMT(SoCMT.getText());
        hoatDong.setDiaChi(DiaChi.getText());
        hoatDong.setIdHopDong(Integer.parseInt(IdHopDong.getText()));
        Timestamp ts = Timestamp.valueOf(ThoiGianBatDau.getText());
        hoatDong.setStart(ts);
        Timestamp ts1 = Timestamp.valueOf(ThoiGianKetThuc.getText());
        int distanceTime =(int)(ts1.getTime() - ts.getTime())/(1000*3600);
        
        hoatDong.setEnd(ts1);
        hoatDong.setThanhtoan(0);
        hoatDong.setChiPhiThue(distanceTime*500);
        hoatDong.setPhiDatCoc(distanceTime*250);
        hoatDong.setTrangthai(0);
        try {
            if(! scheme.add_event(hoatDong)){
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(DangKyJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DangKyJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      // JOptionPane.showConfirmDialog(null, "Thêm hoạt động thành công", "", JOptionPane.YES_NO_OPTION);
    }//GEN-LAST:event_jButton3ActionPerformed
    //boolean TraPhi;
    ButtonGroup b1 = new ButtonGroup();
   // b1.add(jRadioButton1);
    //b1.add(jRadioButton2);
    private void IdHopDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdHopDongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdHopDongActionPerformed
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DiaChi;
    private javax.swing.JTextField IdHopDong;
    private javax.swing.JTextField IdPhong;
    private javax.swing.JTextField SoCMT;
    private javax.swing.JTextField SoDienThoai;
    private javax.swing.JTextField ThoiGianBatDau;
    private javax.swing.JTextField ThoiGianKetThuc;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tenKhachHang;
    // End of variables declaration//GEN-END:variables
}
