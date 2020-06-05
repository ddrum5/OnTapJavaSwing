/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_3;

/**
 *
 * @author DINH
 */
public class NhanVien extends Person {

    private String phongBan;
    private int heSoLuong;
    private int thamNien;
    private long luongCoBan;

    public NhanVien(String phongBan, int heSoLuong, int thamNien, long luongCoBan, String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luongCoBan = luongCoBan;
    }

    public NhanVien() {
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public int getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }

    public long getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(long luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    
    
    public long thucLinh() {
        return luongCoBan * heSoLuong * (1 + thamNien / 100);
    }

    @Override
    public String toString() {
        return super.toString() + "$" + phongBan + "$" + heSoLuong
                + "$" + thamNien + "$" + luongCoBan + "$" + thucLinh() +"\n";
    }
}
