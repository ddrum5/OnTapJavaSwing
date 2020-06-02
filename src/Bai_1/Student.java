/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_1;

/**
 *
 * @author DINH
 */
public class Student extends Person{
    private String maSV;
    private String email;
    private double DTK;

    public Student(String maSV, String email, double DTK, String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.maSV = maSV;
        this.email = email;
        this.DTK = DTK;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + maSV + "\t" +email + "\t" +DTK;
    }
    
    
    
    
    
}
