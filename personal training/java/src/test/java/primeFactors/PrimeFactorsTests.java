package primeFactors;

import org.junit.Test;
import primeFactors.utils.ImmutableList;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static primeFactors.PrimeFactors.of;

public class PrimeFactorsTests {

    @Test
    public void of_1isNone() {
        assertThat(of(1))
                .isEqualTo(ImmutableList.of());
    }

    @Test
    public void of_2is2() {
        assertThat(of(2))
                .isEqualTo(ImmutableList.of(2));
    }

    @Test
    public void of3_is3() {
        assertThat(of(3))
                .isEqualTo(ImmutableList.of(3));
    }

    @Test
    public void of4_is22() {
        assertThat(of(4))
                .isEqualTo(ImmutableList.of(2, 2));
    }

}