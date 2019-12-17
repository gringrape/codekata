package primeFactors;

import org.junit.Test;
import primeFactors.utils.ImmutableList;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static primeFactors.PrimeFactors.isPrime;
import static primeFactors.PrimeFactors.of;
import static primeFactors.utils.ImmutableList.of;

public class PrimeFactorsTests {

    @Test
    public void of_1isNone() {
        assertThat(of(1))
                .isEqualTo(of());
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
                .isEqualTo(of(2, 2));
    }

    @Test
    public void of6_is23() {
        assertThat(of(6))
                .isEqualTo(of(2, 3));
    }

    @Test
    public void of8_is222() {
        assertThat(of(8))
                .isEqualTo(of(2, 2, 2));
    }

    @Test
    public void of10_is25() {
        assertThat(of(10))
                .isEqualTo(of(2, 5));
    }
    
    @Test
    public void of100_is2255() {
        assertThat(of(100))
                .isEqualTo(ImmutableList.of(2, 2, 5, 5));

    }

    @Test
    public void isPrime7_isTrue() {
        assertThat(isPrime(7))
                .isEqualTo(true);
    }

    @Test
    public void isPrime8_isFalse() {
        assertThat(isPrime(8))
                .isEqualTo(false);
    }

    @Test
    public void isPrimePrimeNumbersLessThan20_isAllTrue() {
        int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19};

        for (int num : primeNumbers) {

            assertThat(isPrime(num))
                    .isEqualTo(true);

        }
    }

    // TODO: 2019-12-17
    // - 현재 숫자를 두개의 약수로 쪼개는 것 까지는 수행했다.
    // - 두개의 약수를 세개의 약수로 나누고 싶은 경우에는 위의 과정에서 나누어진 약수 중 하나를 같은 과정으로 나눌 필요가 있다.

}