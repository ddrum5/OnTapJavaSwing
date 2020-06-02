
package Bai_3;

import java.io.Serializable;

/**
 *
 * @author DINH
 */
public class Person implements Serializable{
    private String hoTen; 
    private String ngaySinh;
    private String diaChi;
    private String gioiTinh;

    public Person() {
    }
    
    public Person(String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return hoTen + "$" + ngaySinh + "$" + diaChi + "$" + gioiTinh;  
    }
    
    
    
}
