package main.java.com.codilityexercises.utils;

public class Commons {

    public static int calculateDimension(int N){

        double log = Math.log(N) / Math.log(2);

        int b = (int)Math.ceil(log);

        double lowExp = Math.pow(2, b-1);
        double maxExp = Math.pow(2, b) - 1;
        if(N >= lowExp && N < maxExp){
            return b;
        }
        return 0;

    }

}
