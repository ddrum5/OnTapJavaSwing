
package Bai_7;

import java.util.Scanner;

public abstract class ThiSinh {
    protected String hoTen, ngaySinh, diaChi;

    public ThiSinh() {
    }

    public ThiSinh(String hoTen, String ngaySinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("Ngày sinh: ");
        ngaySinh = sc.nextLine();
        System.out.print("Địa chỉ: ");
        diaChi = sc.nextLine();
    }
    public abstract double tongDiem();
    @Override
    public String toString() {
        return hoTen + "\t" + ngaySinh + "\t" + diaChi;
    }
    
    
    
}
