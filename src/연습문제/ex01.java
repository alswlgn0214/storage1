package 연습문제;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        // 정수 5개 배열 선언
        int num[] = new int[5];

        // 유저한테 입력받는 행위
        Scanner sc = new Scanner(System.in);

        // 정수 5개 입력 받는 행위
        for(int i =0; i<5;i++){
            num[i] = sc. nextInt();

        }

        for(int i = 0; i<5;i++){
            for(int j =0; j<5;j++){
                if(num[i]>num[j]){
                    int tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;
                }
            }

        }
        System.out.println(num[0]);
        System.out.println(num[1]);




    }
}
