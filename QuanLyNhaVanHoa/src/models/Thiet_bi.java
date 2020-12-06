/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author DucQuyet
 */
public class Thiet_bi {

    private String IDthietbi;
    private String tenThietBi;
    private int soLuong;
    private int khaDung;
    private String moTa;
    
    public Thiet_bi() {
    }

    public Thiet_bi(String IDthietbi, String tenThietBi, int soLuong, int khaDung, String mota) {
        this.IDthietbi = IDthietbi;
        this.tenThietBi = tenThietBi;
        this.soLuong = soLuong;
        this.khaDung = khaDung;
        this.moTa = mota;
    }

    

    public String getIDthietbi() {
        return IDthietbi;
    }

    public void setIDthietbi(String IDthietbi) {
        this.IDthietbi = IDthietbi;
    }

    public String getTenThietBi() {
        return tenThietBi;
    }

    public void setTenThietBi(String tenThietBi) {
        this.tenThietBi = tenThietBi;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getKhaDung() {
        return khaDung;
    }

    public void setKhaDung(int khaDung) {
        this.khaDung = khaDung;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "Thiet_bi{" + "IDthietbi=" + IDthietbi + ", tenThietBi=" + tenThietBi + ", soLuong=" + soLuong + ", khaDung=" + khaDung + ", moTa=" + moTa + '}';
    }
    
    
    

}
