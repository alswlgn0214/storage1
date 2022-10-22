package chapter06;

import java.util.Scanner;

public class exe05 {
    public static void main(String[] args) {

        int n  = new Scanner(System.in).nextInt();
        int divider = 10;
        int radix = 1;

        while (true){
            if (divider>n) break;
            else {
                divider *= 10;
                radix++;
            }
        }


        int[] number = new int[radix];
        divider = 10;
        for (int i = 0; i<radix;i++){
            if(i==0) number[i] = n%divider;
            else{
                number[i]= (n%(divider*10))/divider;
                divider *= 10;
            }

        }
        for(int a:number){
            System.out.print(a);
        }

    }
}
