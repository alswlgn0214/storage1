public class Main {
    public static void main(String[] args) {
        // 대입연산 가독성 차이
//        int number1 = 10;
//        System.out.println("number1 = 10 -> "+ number1);
//        number1 += 10;
//        System.out.println("number1 += 10 -> " + number1);
//        number1 -= 10;
//        System.out.println("number1 -= 10 -> "+ number1);
//        number1 *= 2;
//        System.out.println("number1 *= 2 -> "+ number1);
//        number1 /= 2;
//        System.out.println("number1 /= 2 -> "+ number1);
//        number1 %= 3;
//        System.out.println("number1 %= 3 -> "+ number1);

        // 산술연산
        // 나머지연산자( % )와 나눗셈연산자( / ) 차이

//        int a = 5;
//        int b = 2;
//
//        System.out.println(a/b);  // 몫
//        System.out.println(a%b);  // 나머지

        // 증감연산

//        int c = 10;
//        ++c;  // 전위 연산
//        c++;  // 후위 연산
//        --c;
//
//        int a = 10;
//        int b = ++a;
//
//        System.out.println("result : "+b);
//
//        int x = 10;
//        int y = x++;
//
//        System.out.println("result : "+y);
//        System.out.println("x : "+x);

        // 비교연산
//        int a = 1;
//        int b = 2;
//        boolean c = a!=b;
//        System.out.println(c);

        // 논리연산
        int a = 10;
        int b = 5;

        // and &&
        System.out.println(a > b && a == 10);   // true &&  true => true

        // 드모르간 법칙
        System.out.println(a <= b || a != 10);  // true
        // 수학을 배우는 이유 -> 일반적인 자연현상의 어떠한 관계를 정립한 이론
        System.out.println(a > b && a == 10);  // true


        // or ||
        System.out.println(a > b || a == b);  // true || false => true

        // xor 연산
        System.out.println(a > b ^ a == 10);
        System.out.println(a < b ^ a == 10);

        // not 연산
        System.out.println(!(a<b)); // false
        System.out.println(a<b);   // true

        // 삼항연산 ternary operator

        // 조건식(결과값) ? 값1(true) : 값2(false)

        int abc = 70 > 60 ? 10 : 20;
        int abc1 = true ? 10 : 20;


        // 문자열 연산

        String a1 = "hello";
        String a2 = "world";

        System.out.println(""+a1+""+a2);
    }
}
