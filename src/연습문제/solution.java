package 연습문제;

import java.util.Scanner;

public class solution {
    public static void main(String[] args) {

        // 유저에게 입력받기
        Scanner n = new Scanner(System.in);
        int sc = n.nextInt();


        // 배열에 숫자 넣고 다 더하기
        int[] num = new int[sc];
        int sum = 0;
        for (int i = 0; i < sc;i++){
            num[i] = n.nextInt();
            sum += num[i];

        }
        // 그 값을 나누어서 평균 구하기
        float a = sum/sc;
        System.out.println(a);


        // 평균보다 큰 정수 구해서 출력하기
        for (int j = 0; j < sc; j++){
            if (num[j] > a){
                System.out.println(num[j]);
            }
        }


    }


}

