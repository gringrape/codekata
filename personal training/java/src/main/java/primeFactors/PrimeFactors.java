package primeFactors;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class PrimeFactors {

    public static List<Integer> of(Integer n) {

        List<Integer> primes = new ArrayList<>();

        OptionalInt divider = IntStream.range(2, n)
                .filter(i -> n % i == 0)
                .findFirst();

        divider.ifPresent(i -> {
            primes.add(i);
            if (isPrime(n / i))
                primes.add(n / i);
            else
                primes.addAll(of(n / i));
        });

        if (n != 1 && !divider.isPresent())
            primes.add(n);

        return primes;
    }

    public static boolean isPrime(Integer number) {

        int[] ints = IntStream.range(2, number)
                .filter(i -> number % i == 0)
                .toArray();

        return ints.length == 0;
    }

}
