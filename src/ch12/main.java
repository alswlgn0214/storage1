package ch12;


import java.util.Calendar;
import java.util.Date;

public class main {
    public static void main(String[] args) {

        Calendar thatDay = Calendar.getInstance();
        thatDay.set(Calendar.YEAR,2020);
        thatDay.set(Calendar.MONTH,4);
        thatDay.set(Calendar.DATE,1);

        int year = thatDay.get(Calendar.YEAR);

        int num = thatDay.get(Calendar.DAY_OF_YEAR);

        Date d = new Date();
        Calendar today = Calendar.getInstance();
        today.setTime(d);
        System.out.println(d);

        int year1 = today.get(Calendar.YEAR);
        int num1 = today.get(Calendar.DAY_OF_YEAR);

        int sum = 365 * (year1 - year) + (num1 - num);

        boolean a = today.after(thatDay);

        if(a == true){
            System.out.println(sum);

        }
        else System.out.println("X");


    }
}
