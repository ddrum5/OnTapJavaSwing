
package Bai_7;

import java.util.Scanner;


public class ThiSinhKhoiA extends ThiSinh {
    double diemToan, diemLy, diemHoa;

    public ThiSinhKhoiA() {
    }

    public ThiSinhKhoiA(double diemToan, double diemLy, double diemHoa, String hoTen, String ngaySinh, String diaChi) {
        super(hoTen, ngaySinh, diaChi);
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }
    
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Điểm toán: ");
        diemToan = sc.nextDouble();
        System.out.print("Điểm lý: ");
        diemLy = sc.nextDouble();
        System.out.print("Điểm hoá: ");
        diemHoa = sc.nextDouble();
    }
    
    @Override
    public double tongDiem(){
        return diemToan + diemHoa + diemLy;
    }
    @Override
    public String toString() {
        return super.toString() + "\t" + diemToan + "\t" + diemLy + "\t" + diemHoa + "\t" + tongDiem(); 
    }
    
    
}
