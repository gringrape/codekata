package primeFactors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class PrimeFactors {

    public static List<Integer> of(Integer number) {

        List<Integer> result = new ArrayList<>();

        if (number > 1) {
            int minPrime = findMinPrime(number);
            result.add(minPrime);
            result.addAll(PrimeFactors.of(number / minPrime));
        }

        return result;
    }

    public static int findMinPrime(Integer number) {

        return IntStream.range(2, number + 1)
                .filter(i -> number % i == 0)
                .findFirst()
                .getAsInt();

    }
}
