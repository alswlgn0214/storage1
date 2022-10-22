package 연습문제;

import java.util.Scanner;

public class theater {

    private String movieTitle;

    private int row;
    private int column;
    private boolean seat[][];

    theater(String title){
        this.movieTitle = title;
        this.row = 14;
        this.column = 14;
    }
    theater(int row, int column){
        this.row = row;
        this.column = column;
    }

    void makeReservation(int row, int column){
        if((this.row >= row && row >= 0) && (this.column >=column && column >= 0)) seat[row][column] = true;

    }
    void showSeats(){
        for(int i=0;i<seat.length;i++){
            for(int j=0;j<seat[i].length;j++){
                if(seat[i][j] == false) System.out.print("?");
                else System.out.print("!");
            }
            System.out.println();
        }
    }






}
