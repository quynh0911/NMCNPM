  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;


import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DucQuyet
 */
public class HopDong {
    private int idHopDong;
    private String tenKhachHang;
    private String diaChi;
    private String soCMT;
    private String soDienThoai;
    private int idPhong;
    private int chiPhiThue;
    private int phiDatCoc;
    private int trangthai;
    private int thanhtoan;
    private Timestamp start ;
    private Timestamp end;
    
    

    public HopDong() {
    }

    public HopDong(int idHopDong, String tenKhachHang,String soDienThoai, String diaChi, String soCMT, Timestamp start, Timestamp end,  int chiPhiThue, int phiDatCoc, int idPhong, int trangthai, int thanhtoan) {
        this.idHopDong = idHopDong;
        this.tenKhachHang = tenKhachHang;
        this.diaChi = diaChi;
        this.soCMT = soCMT;
        this.soDienThoai = soDienThoai;
        this.idPhong = idPhong;
        this.chiPhiThue = chiPhiThue;
        this.phiDatCoc = phiDatCoc;
        this.trangthai = trangthai;
        this.thanhtoan = thanhtoan;
        this.start = start;
        this.end = end;
    }

    //public HopDong(int aInt, String string, String string0, String string1, String string2, Timestamp timestamp, Timestamp timestamp0, int aInt0, int aInt1, int aInt2) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
    
    

    public int getIdHopDong() {
        return idHopDong;
    }

    public void setIdHopDong(int idHopDong) {
        this.idHopDong = idHopDong;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoCMT() {
        return soCMT;
    }

    public void setSoCMT(String soCMT) {
        this.soCMT = soCMT;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public int getIdPhong() {
        return idPhong;
    }

    public void setIdPhong(int idPhong) {
        this.idPhong = idPhong;
    }

    public int getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(int chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getPhiDatCoc() {
        return phiDatCoc;
    }

    public void setPhiDatCoc(int phiDatCoc) {
        this.phiDatCoc = phiDatCoc;
    }

    public int isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    public int isThanhtoan() {
        return thanhtoan;
    }

    public void setThanhtoan(int thanhtoan) {
        this.thanhtoan = thanhtoan;
    }

    public Timestamp getStart() {
        return start;
    }

    public void setStart(Timestamp start) {
        this.start = start;
    }

    public Timestamp getEnd() {
        return end;
    }

    public void setEnd(Timestamp end) {
        this.end = end;
    }

    

    @Override
    public String toString() {
        return "Hop_dong{" + "idHopDong=" + idHopDong + ", tenKhachHang=" + tenKhachHang + ", diaChi=" + diaChi + ", soCMT=" + soCMT + ", soDienThoai=" + soDienThoai + ", idPhong=" + idPhong + ", chiPhiThue=" + chiPhiThue + ", phiDatCoc=" + phiDatCoc + ", trangthai=" + trangthai + ", thanhtoan=" + thanhtoan + ", start=" + start + ", end=" + end + '}';
    }
    
    

}
