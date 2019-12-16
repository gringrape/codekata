package primeFactors.utils;

import org.junit.Test;

import java.util.Arrays;

import static java.util.Collections.unmodifiableList;
import static org.assertj.core.api.Java6Assertions.assertThat;
import static primeFactors.utils.ImmutableList.of;

public class ImmutableListTest {

    @Test
    public void of11_list11() {
        assertThat(of(1, 1))
                .isEqualTo(unmodifiableList(
                        Arrays.asList(1, 1)
                ));

    }

}