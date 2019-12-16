package primeFactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> of(Integer n) {

        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                primes.add(i);
                primes.add(n / i);
                break;
            }
        }

        if (n != 1 && primes.size() == 0)
            primes.add(n);

        return primes;

    }

}
