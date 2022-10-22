import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a = "helloworld";
        // 기본형은 . 뒤에 아무것도 안나옴
        // 참조형은 . 뒤에 참조에 관련된 명령어들이 나옴
//        System.out.println(a.toUpperCase());
//        int b = sc.nextInt();
//        System.out.println("this number:"+b);

        System.out.println("Insert your score");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        String grade ="";
// 0 ~ 100 score
        switch (score / 10){
            case 9 : grade = "A"; break;
            case 8 : grade = "B"; break;
            case 7 : grade = "C"; break;
            case 6 : grade = "D"; break;
            case 5 : grade = "E"; break;
            default: grade = "no human";

        }
        System.out.println("Your score is "+ grade);
        }
    }



