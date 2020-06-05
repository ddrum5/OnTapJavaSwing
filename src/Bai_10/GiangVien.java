
package Bai_10;


public class GiangVien {
    private String hoTen, maGiangVien, diaChi, gioiTinh, khoa;

    public GiangVien() {
    }

    public GiangVien(String hoTen, String maGiangVien, String diaChi, String gioiTinh, String khoa) {
        this.hoTen = hoTen;
        this.maGiangVien = maGiangVien;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.khoa = khoa;
    }

    @Override
    public String toString() {
        return hoTen + "\t" + maGiangVien + "\t" + diaChi + "\t" + gioiTinh + "\t" + khoa; 
    }
    
    
}
