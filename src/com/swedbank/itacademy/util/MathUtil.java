package com.swedbank.itacademy.util;

public class MathUtil {

    // TODO implement code
    public static int factorial(int num) {
            if(num == 1){
                return 1;
            }
            return num * (factorial(num-1));
        }
    }
}
