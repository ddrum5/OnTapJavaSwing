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
public class SinhVienMatMa extends SinhVien{
    private String donVi;
    private double luong;

    public SinhVienMatMa() {
    }

    public SinhVienMatMa( String maSV, String hoTen, String ngaySinh, String gioiTinh, double dTB,String donVi, double luong) {
        super(maSV, hoTen, ngaySinh, gioiTinh, dTB);
        this.donVi = donVi;
        this.luong = luong;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + donVi + "\t" + luong;
    }
    
    
    
}
