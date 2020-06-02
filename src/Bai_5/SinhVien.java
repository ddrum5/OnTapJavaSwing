/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_5;

/**
 *
 * @author DINH
 */
public class SinhVien {
    private String maSV;
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private double dTB;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, String ngaySinh, String gioiTinh, double dTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.dTB = dTB;
    }
    
    @Override
    public String toString() {
        return maSV + "\t" +hoTen + "\t" + ngaySinh + "\t" + gioiTinh + "\t" + dTB;
    }
    
    
    
}
