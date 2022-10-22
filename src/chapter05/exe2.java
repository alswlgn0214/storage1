package chapter05;

public class exe2 {
    public static void main(String[] args) {
        int evenSum = 0;
        int oddSum = 0;

        for( int i = 0; i <= 100; i += 1){
            if (i % 2 == 0){
                evenSum += i;}
            else{
                oddSum += i;
            }

        }
        System.out.println("짝수의 합계는 "+evenSum);
        System.out.println("홀수의 합계는 "+oddSum);
    }
}
