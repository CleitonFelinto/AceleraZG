package MultiplesOf3Or5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MultiplesOf3Or5 {
    public static void main(String[] args) {

        Set<Integer> multiples = new HashSet<>();
        for (int i = 0; i < 1000; i++){
            if (i % 3 == 0){
                multiples.add(i);
            } else if (i % 5 == 0) {
                multiples.add(i);
            }
        }
        int sum = multiples.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}