/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author DINH
 */
public class NewClass {
    public static int binarySearch(int []a, int l, int r, int x){
        int m=(l+r)/2;
        if(x==a[m]){
            return m;
        } else if (x < a[m]){
            return binarySearch(a,l,m-1,x);
        } else {
            return binarySearch(a,m+1, r, x);
        }
    }
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            int x=(int)(Math.random()*50);
            a[i] = x;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
            if((i+1)%10==0)
                System.out.println();
        }
        Arrays.sort(a);
        System.out.println("\n\nsau khi sx");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
            if((i+1)%10==0)
                System.out.println();
        }
        System.out.println("Nhap x: ");
        int x = new Scanner(System.in).nextInt();
        System.out.println(binarySearch(a, 0, a.length-1, x));
    }
}
