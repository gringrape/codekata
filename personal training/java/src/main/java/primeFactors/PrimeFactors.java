package primeFactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> of(Integer num) {

        List<Integer> result = new ArrayList<>();
        if (num > 1) {
            Integer firstFactor =
                    PrimeFactors.firstFactorOf(num);
            result.add(firstFactor);
            result.addAll(PrimeFactors.of(num / firstFactor));
        }

        return result;

    }

    public static Integer firstFactorOf(Integer num) {

        if (num < 2)
            throw new NumberOutOfRangeException(num);

        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return i;
        }

        return num;
    }
}
