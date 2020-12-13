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
public class Phong {
    int idPhong;
    private String tenPhong;
    private String viTri;
    private int dienTich;
    private boolean trangThai;
    private String moTa;

    public Phong() {
    }

    public Phong(int idPhong, String tenPhong, String viTri, int dienTich, boolean trangThai, String moTa) {
        this.idPhong = idPhong;
        this.tenPhong = tenPhong;
        this.viTri = viTri;
        this.dienTich = dienTich;
        this.trangThai = trangThai;
        this.moTa = moTa;
    }

    public Phong(String tenPhong, String viTri, int dienTich, boolean trangThai, String moTa) {
        this.tenPhong = tenPhong;
        this.viTri = viTri;
        this.dienTich = dienTich;
        this.trangThai = trangThai;
        this.moTa = moTa;
    }

    

    public int getID() {
        return idPhong;
    }

    public void setID(int ID) {
        this.idPhong = ID;
    }

    public int getIdPhong() {
        return idPhong;
    }

    public void setIdPhong(int idPhong) {
        this.idPhong = idPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "Phong{" + "idPhong=" + idPhong + ", tenPhong=" + tenPhong + ", viTri=" + viTri + ", dienTich=" + dienTich + ", trangThai=" + trangThai + ", moTa=" + moTa + '}';
    }
    
    
    
    
}
