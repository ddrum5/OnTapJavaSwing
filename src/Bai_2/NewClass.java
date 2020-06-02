/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author DINH
 */
public class NewClass {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("NhanVien.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<NhanVien> o= new ArrayList<>();
            o = (ArrayList<NhanVien>) ois.readObject();
            ois.close();
            fis.close();
            for(NhanVien nhanVien:o){
                System.out.println(nhanVien.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
