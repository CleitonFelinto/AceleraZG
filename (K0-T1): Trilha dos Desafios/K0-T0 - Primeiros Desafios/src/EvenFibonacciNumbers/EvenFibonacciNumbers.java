package EvenFibonacciNumbers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EvenFibonacciNumbers {
    public static void main(String[] args) {

        int previousNumber = 0;
        int actualNumber = 1;
        int nextNumber = 0;

        int total = 0;

        while (actualNumber < 4000000){
            nextNumber = previousNumber + actualNumber;
            previousNumber = actualNumber;
            actualNumber = nextNumber;

            if (actualNumber % 2 == 0){
                total += actualNumber;
            }
        }
        System.out.println(total);
    }
}