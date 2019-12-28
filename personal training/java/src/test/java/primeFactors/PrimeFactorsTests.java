package primeFactors;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class PrimeFactorsTests {

    @Test
    public void of_tests() {

        assertThat(PrimeFactors.of(1))
                .isEqualTo(List.of());

        assertThat(PrimeFactors.of(2))
                .isEqualTo(List.of(2));

        assertThat(PrimeFactors.of(4))
                .isEqualTo(List.of(2, 2));

        assertThat(PrimeFactors.of(8))
                .isEqualTo(List.of(2, 2, 2));

    }

    @Test
    public void firstFactorOf_tests() {

        assertThat(PrimeFactors.firstFactorOf(2))
                .isEqualTo(2);

        assertThat(PrimeFactors.firstFactorOf(4))
                .isEqualTo(2);

        assertThat(PrimeFactors.firstFactorOf(6))
                .isEqualTo(2);

        assertThat(PrimeFactors.firstFactorOf(23))
                .isEqualTo(23);

    }

    @Test(expected = NumberOutOfRangeException.class)
    public void firstFactorOf_OutOfRangeInput() {

        PrimeFactors.firstFactorOf(-20);

    }

}