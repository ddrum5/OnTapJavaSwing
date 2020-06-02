/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_3;

import java.io.Serializable;

/**
 *
 * @author DINH
 */
public class NhanVien extends Person implements Serializable {

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

    public long thucLinh() {
        return luongCoBan * heSoLuong * (1 + thamNien / 100);
    }

    @Override
    public String toString() {
        return super.toString() + "$" + phongBan + "$" + heSoLuong
                + "$" + thamNien + "$" + luongCoBan + "$" + thucLinh() +"\n";
    }
}
