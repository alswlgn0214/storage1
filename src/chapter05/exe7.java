package chapter05;

public class exe7 {
    public static void main(String[] args) {

        int total = 0;
        while(true){
            int newnumber = (int)(Math.random() * 10);
            if(6==newnumber) {
                System.out.println("New number is "+newnumber);break;
            }
            else {
                System.out.println(newnumber);
                total++;

            }
        }
        System.out.println(total);



        }

}
