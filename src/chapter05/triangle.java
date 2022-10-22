package chapter05;

public class triangle {
    public static void main(String[] args) {
        int mid = 5;
        int left = mid;
        int right = mid;



        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                if (left <= j && j <= right) System.out.print("*");
                else System.out.print(" ");;
            }
            left--;
            right++;
            System.out.println();
        }
    }
}
