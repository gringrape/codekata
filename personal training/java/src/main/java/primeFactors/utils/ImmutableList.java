package primeFactors.utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ImmutableList {

    public static <K> List<K> of(K... targets) {

        return Collections.unmodifiableList(
                Arrays.asList(targets)
        );

    }

}
