
package Bai_4;

public class Student extends Person {
    private String maSV, email, diemTK;

    public Student(String maSV, String email, String diemTK, String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.maSV = maSV;
        this.email = email;
        this.diemTK = diemTK;
    }
    public Student(){
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiemTK() {
        return diemTK;
    }

    public void setDiemTK(String diemTK) {
        this.diemTK = diemTK;
    }
    

    @Override
    public String toString() {
        return super.toString() + "\t" + maSV + "\t" + email + "\t" + diemTK;
    }
    
}
