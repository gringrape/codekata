package primeFactors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class PrimeFactors {

    public static List<Integer> of(Integer number) {

        List<Integer> result = new ArrayList<>();

        Integer current = number;
        while (!isPrime(current)) {
            for (int i = 2; i < current; i++) {
                if (current % i == 0) {
                    result.add(i);
                    current /= i;
                    break;
                }
            }
        }

        if (current != 1) {
            result.add(current);
        }

        if (number > 1 && result.size() == 0) {
            result.add(number);
        }

        return result;
    }

    public static boolean isPrime(Integer number) {

        long count = IntStream
                .range(2, number)
                .filter(i -> number % i == 0)
                .count();

        return !(count > 0);
    }
}
