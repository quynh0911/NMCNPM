/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.HopDong;
import org.apache.poi.xwpf.usermodel.Borders;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;

import org.apache.poi.xwpf.usermodel.XWPFDocument;

import org.apache.poi.xwpf.usermodel.XWPFParagraph;

import org.apache.poi.xwpf.usermodel.XWPFRun;
/**
 *
 * @author Admin(quynh0911)
 */
public class XuatHopDongRaFileWord {
   
    HopDong hopDong;
//    private String HoTen;
//    private String SoCMT;
//    private String NgaySinh;
//    private String SoDT;
//    private String NguyenQuan;
//    //private String NgayThue;
//    private String PhongThue;
//    private String ThoiGianBatDau;
//    private String ThoiGianKetThuc;
//    private String NgayKy;
//    private String LyDoThue;
//    private int MaHD;
//    private int ChiPhi;
//    private int ChiPhiCoc;
    
    public XuatHopDongRaFileWord(String tenKhachHang, String phong, String thoiGianBatDau, String thoiGianKetThuc ) throws SQLException, ClassNotFoundException{
        
        try {
            //HoatDongService hoatDong = new HoatDongService();
            //hopDong = hoatDong.getHopDongById(id);
            //System.out.println(hopDong.getIdHopDong());
            //Bước 1: Khởi tạo đối tượng để sinh ra file word
            XWPFDocument document = new XWPFDocument();

            //Bước 2: Tạo tiêu đề bài viết

            XWPFParagraph titleGraph = document.createParagraph();

            titleGraph.setAlignment(ParagraphAlignment.CENTER);
          

            String title = "HỢP ĐỒNG CHO THUÊ NHÀ VĂN HOÁ";

            XWPFRun titleRun = titleGraph.createRun();
          
            titleRun.setText("CỘNG HOÀ XÃ HỘI CHỦ NGHĨA VIỆT NAM");
            titleRun.addBreak();
            titleRun.setBold(true);
            titleRun.setText("Độc lập - Tự do - Hạnh phúc");
            titleRun.addBreak();
            titleRun.setText("---------------------------");
            titleRun.setFontSize(15);
            XWPFParagraph titleGraph1 = document.createParagraph();
            titleGraph1.setAlignment(ParagraphAlignment.CENTER);
            XWPFRun titleRun1 = titleGraph1.createRun();
            titleRun1.setBold(true);
            //titleRun1.addBreak();
            titleRun1.setFontSize(20);
            titleRun1.setText(title);

 
            //Bước 3: Tạo đoạn văn bản 1 trong tài liệu:

            XWPFParagraph para1 = document.createParagraph();

            para1.setAlignment(ParagraphAlignment.LEFT);
           
           
            XWPFRun para1Run = para1.createRun();
            
            para1Run.setFontSize(15);
            para1Run.setText("Bên thuê: ");
            para1Run.setText(tenKhachHang);
            para1Run.addBreak();
           // para1Run.setText("Số CMT: ");
            //para1Run.setText(hopDong.getSoCMT());
           // para1Run.addBreak();
            //para1Run.setText("Số ĐT: ");
            //para1Run.setText(hopDong.getSoDienThoai());
//            para1Run.addTab();
//            para1Run.addTab();
//            para1Run.addTab();
//            para1Run.addTab();
           // para1Run.setText("Ngày sinh: ");
           // para1Run.setText(NgaySinh);
//            para1Run.addBreak();
//            para1Run.setText("Nguyên quán: ");
//            para1Run.setText(hopDong.getDiaChi());  
//            para1Run.addBreak();

            //Bước 5: Tạo đoạn văn bản 2:

            XWPFParagraph para2 = document.createParagraph();           

            para2.setAlignment(ParagraphAlignment.LEFT); 
            XWPFRun para2Run = para1.createRun();
            para2Run.setFontSize(15);
            para2Run.setText("Nội dung bản hợp đồng: ");
            para2Run.addBreak();
           // para2Run.setText("Ngày thuê: ");
            //para2Run.setText(NgayThue);
            para2Run.addBreak();
            para2Run.setText("Thời gian bắt đầu: ");
            para2Run.setText(thoiGianBatDau);
            para2Run.addTab();
            para2Run.addTab();
            para2Run.addTab();
            para2Run.addTab();
            para2Run.setText("Thời gian kết thúc: ");
            para2Run.setText(thoiGianKetThuc);
            para2Run.addBreak();
//            para2Run.setText("Chi phí thuê: ");
//            para2Run.setText(hopDong.getChiPhiThue());
//            para2Run.addBreak();
            
             XWPFParagraph para3 = document.createParagraph();           

            para3.setAlignment(ParagraphAlignment.LEFT); 
            XWPFRun para3Run = para1.createRun();
//            para3Run.setFontSize(15);
//            para3Run.setText("Tổng chi phí hết: "+ hopDong.getChiPhiThue());
//            para3Run.addBreak();
//            para3Run.setText( "Số tiền đặt cọc: " + hopDong.getPhiDatCoc());
//            para3Run.addBreak();
            para3Run.setText("Bên thuê đảm bảo giữ gìn vệ sinh, bảo quản cơ sở vật chất thật tốt.");
           
            //Bước 8: Ghi dữ liệu ra file word

            FileOutputStream out = new FileOutputStream("hopdong.docx");

            document.write(out);

            out.close();

            document.close();

        } catch (IOException ex) {

            Logger.getLogger(XuatHopDongRaFileWord.class.getName()).log(Level.SEVERE, null, ex);

        }

    }
    
}
