
package Bai_8;

import java.util.Scanner;

public class Number {
    private int value;
    private int max;
    private int min;

    public Number() {
    }

    public Number(int value, int max, int min) {
        this.value = value;
        this.max = max;
        this.min = min;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Value: ");
        value = sc.nextInt();
        System.out.print("Max: ");
        max = sc.nextInt();
        System.out.print("Min: ");
        min = sc.nextInt();
    }
    
    public boolean soNT(){
        if(value<2){
            return false;
        } else {
            for(int i=2; i<=Math.sqrt(value); i++){
                if(value / i == 0){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return value + "\t" + max + "\t" + min;
    }
    
}
