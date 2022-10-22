package OOP;

public class Finder {



        int untilNowMax ;
        int untilNowMin ;


        void findMax(int ...x) {
            int max = x[0];
            int sum = 0;
            for (int i = 0; i < x.length; i++) {
                if (max < x[i]) {
                    max = x[i];
                    if(untilNowMax < max) untilNowMax = max;
                }
            }
            System.out.println(max);
        }
        void findmin(int ...x){
            int Min = x[0];
            for(int i = 0; i < x.length; i++){
                if(Min > x[i]) {
                    Min = x[i];
                    if(untilNowMin > Min) untilNowMin=Min;
                }
            }
            System.out.println(Min);
        }

        void findMaxMin(int ...x){
            findMax(x);
            findmin(x);
        }

        void showUntil(boolean isMax){
            if(isMax) System.out.println(untilNowMax);
            else System.out.println(untilNowMin);
        }





}
