
package Bai_7;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ThiSinh> dsTS = new ArrayList<>();
        ThiSinh ts = null;
        System.out.print("Nhập số lượng thí sinh: ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nThí sinh thứ " + (i+1) + ":");
            String check;
            do {                
                System.out.print("Thí sinh khối A,C ?:");
                check= new Scanner(System.in).nextLine();
                if(check.equalsIgnoreCase("a")){
                    ts = new ThiSinhKhoiA();
                } else if(check.equalsIgnoreCase("c")){
                    ts = new ThiSinhKhoiC();
                } else {
                    System.out.println("Chỉ nhập 'A' hoặc 'C'!"  );
                }
            } while (check.equalsIgnoreCase("a")==false && check.equalsIgnoreCase("c")==false);
            ts.nhap();
            dsTS.add(ts);
        }
        
        System.out.println("\nDanh sách thí sinh:");
        for(ThiSinh x:dsTS){
            System.out.println(x);
        }
        
        System.out.println("\nDanh sách thi sinh trúng tuyển:");
        for(ThiSinh x:dsTS){
            if(x.tongDiem() > 20){
                System.out.println(x);
            }
        }
        
        
    }
    
}
