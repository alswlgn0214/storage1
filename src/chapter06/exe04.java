package chapter06;

public class exe04 {
    public static void main(String[] args) {
        int[] num1 = {1,2,3,4,5,6,7,8,9,10};
        int[] num2 = new int[10];


        for (int i = 0; i<num1.length;i++){
            num2[i] = num1[i] * num1[i];


        }
        for(int a:num2){
            System.out.println(a);
        }
    }
}



