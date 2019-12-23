package primeFactors;

import java.util.*;
import java.util.stream.IntStream;

public class PrimeFactors {

    public static List<Integer> of(Integer number) {

        List<Integer> result = new ArrayList<>();

        // TODO: 2019-12-23 primeNumber 인지 체크하는 로직이 중복되어 나타난다.
        // TODO: 2019-12-23 if present or else 를 사용해서 간결하게 표현하자.
        if (number > 1) {
            IntStream.range(2, number)
                    .filter(i -> number % i == 0)
                    .findFirst()
                    .ifPresentOrElse(
                            i -> {
                                result.add(i);
                                result.addAll(of(number / i));
                            },
                            () -> {
                                result.add(number);
                            }
                    );
        }
        
        return result;
    }
}
