package LargestPrimeFactor;

import java.util.ArrayList;
import java.util.List;

public class LargestPrimeFactor {
    public static void main(String[] args) {

        long number = 600851475143L;
        long largestPrimeFactor = number;
        long i = 2;

        while (i <= number && number != 1) {
            if (number % i == 0) {
                number = number / i;
                largestPrimeFactor = i;
            }
            else {
                i = i+1;
            }
        }

        System.out.println(largestPrimeFactor);
    }
}