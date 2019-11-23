package com.company.newpackage;

public class Recur {
    public static void  main(String[] args) {
      int fact =  fact(5);
        System.out.println(fact);
    }
    public static int fact(int n){
        if (n < 0){
            throw new IllegalArgumentException();

        }

        int result = 1;
        for(int i = 1; i<= n; i++){
            result = result * i;
        }
        if (n == 0){
            return result;
        }

        return result;
    }
}
