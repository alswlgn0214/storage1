package 연습문제;

import java.util.Scanner;

public class timer {


    private int second;
    int minute;
    int hour;

    // 초기화해주는 this
    timer() {
        this.second = 0;
        this.minute = 0;
        this.hour = 0;
    }

    void PlusSecond(){
        if(this.second == 60){
            this.second = 0;
            this.minute++;

        }
        else this.second++;
    }

    void MinusSecond(){
        if(this.second == 0){
            if(this.hour == 0 && this.minute == 0) System.out.println("time is zero");
            else{
                this.second = 59;
                MinusHour();
            }
        }
        else this.second--;
    }
    void PlusMinute(){
        if(this.minute == 60){
            this.minute = 0;
            this.hour++;

        }
        else this.minute++;
    }
    void PlusHour(){
        if(this.hour == 60){
            this.hour = 59;
            System.out.println("Hour is max");
        }
        else this.hour++;
    }
    void MinusHour(){

    }




}


























    //    void PlusSecond(int x){
//        if (second + x > 59){
//            System.out.println("X");
//        }
//        else second = second + x;
//    }
//    void PlusMinute(int x){
//        if (minute + x > 59){
//            System.out.println("X");
//        }
//        else minute = minute + x;
//    }
//    void PlusHour(int x){
//        if (hour + x > 59){
//            System.out.println("X");
//        }
//        else hour = hour + x;
//
//    }
//
//}

