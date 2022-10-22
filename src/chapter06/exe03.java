package chapter06;

public class exe03 {
    public static void main(String[] args) {
        int[] score = {90,80,60,100};

        int totalScore = 0;

        double avgScore = 0;

        for (int number : score){
            totalScore += number;

        }
        System.out.println(totalScore);
        System.out.println(totalScore/score.length);
    }
}
