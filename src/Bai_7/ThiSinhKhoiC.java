
package Bai_7;

import java.util.Scanner;


public class ThiSinhKhoiC extends ThiSinh {
    double diemVan, diemSu, diemDia;

    
    public ThiSinhKhoiC(){  
    }

    public ThiSinhKhoiC(double diemVan, double diemSu, double diemDia, String hoTen, String ngaySinh, String diaChi) {
        super(hoTen, ngaySinh, diaChi);
        this.diemVan = diemVan;
        this.diemSu = diemSu;
        this.diemDia = diemDia;
    }
    
    
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Điểm Văn: ");
        diemVan = sc.nextDouble();
        System.out.print("Điểm Sử: ");
        diemSu = sc.nextDouble();
        System.out.print("Điểm Địa: ");
        diemDia = sc.nextDouble();
    }
    
    @Override
    public double tongDiem(){
        return diemVan + diemSu + diemDia;
    }
    @Override
    public String toString() {
        return super.toString() + "\t" + diemVan + "\t" + diemSu + "\t" + diemDia + "\t" + tongDiem(); 
    }
}
