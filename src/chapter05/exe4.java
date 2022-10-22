package chapter05;

public class exe4 {
    public static void main(String[] args) {
        char alphabet = 97;
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                if (i>=j){
                    System.out.print(alphabet);
                }
            }
            alphabet++;
            System.out.println();
        }

    }
}
