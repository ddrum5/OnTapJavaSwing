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
public class SinhVienHTTT extends SinhVien{
    private double hocPhi;

    public SinhVienHTTT() {
    }

    public SinhVienHTTT( String maSV, String hoTen, String ngaySinh, String gioiTinh, double dTB, double hocPhi) {
        super(maSV, hoTen, ngaySinh, gioiTinh, dTB);
        this.hocPhi = hocPhi;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + hocPhi;
    }
    
    
}
