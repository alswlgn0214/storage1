package project;

public class zapan {

    int pocari;
    int cola;
    int cider;
    int wellch;
    int fanta;

    zapan(){
        this.cola = 15;
        this.pocari = 15;
        this.cider = 15;
        this.wellch = 15;
        this.fanta = 15;
    }
    String[] name = {"콜라","포카리","사이다","웰치스","환타"};
    int[] num = {this.cola,this.pocari,this.cider,this.wellch,this.fanta};
    int[] price = {700,1000,100,500,500};

    void takeCola(int x){
        if(x>this.cola){
            System.out.println("x");
        }
        else {
            this.cola = this.cola - x;
            System.out.println(1000*x);
        }

    }
    void takePocari(int x){
        if(x>this.pocari){
            System.out.println("x");
        }
        else
        {this.pocari = this.pocari -x;
        System.out.println(700*x);}
    }
    void takeCider(int x){
        if(x>this.cider){
            System.out.println("x");
        }
        else
        {this.cider = this.cider -x;
        System.out.println(1000*x);}
    }
    void takeWellch(int x){
        if(x>this.wellch){
            System.out.println("x");
        }
        else
        {this.wellch = this.wellch -x;
        System.out.println(500*x);}
    }
    void takeFanta(int x){
        if(x>this.fanta){
            System.out.println("x");
        }
        else{
            this.fanta = this.fanta -x;
            System.out.println(500*x);
        }
    }
    void showZapan(){
        for(int i = 0; i<5;i++){
            System.out.print(name[i]+" ,");
        }
        System.out.println();

        for(int i =0;i<5;i++){
        System.out.print(num[i] + " , ");}
        System.out.println();

        for(int i=0;i<5;i++){
        System.out.print(price[i]+" , ");}

    }
}
