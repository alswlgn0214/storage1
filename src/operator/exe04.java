package operator;

public class exe04 {
    public static void main(String[] args) {

        // 쓰레기값
        int age = 0;
        double height = 0;
        boolean withparents = false;
        boolean hasHeartDisease = false;
                            // 6살 이상인 경우                                // 6살 미만인 경우
        boolean canHeRide = (age > 6) && height > 120 && !hasHeartDisease || height > 120 && withparents;
    }
}
