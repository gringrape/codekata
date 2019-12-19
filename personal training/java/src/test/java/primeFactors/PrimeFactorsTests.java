package primeFactors;

import org.junit.Test;

import java.util.List;

import static java.util.List.of;
import static java.util.List.of;
import static org.assertj.core.api.Java6Assertions.assertThat;
import static primeFactors.PrimeFactors.*;
import static primeFactors.PrimeFactors.of;

public class PrimeFactorsTests {

    // 테스트는 만들고자 하는 단위를 명세하는 역할을 한다.

    @Test
    public void of1_isNone() {
        assertThat(of(1))
                .isEqualTo(of());
    }

    @Test
    public void of2_is2() {
        assertThat(of(2))
                .isEqualTo(List.of(2));

    }

    @Test
    public void of3_is3() {
        assertThat(of(3))
                .isEqualTo(List.of(3));

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
    public void of16_is2222() {
        assertThat(of(16))
                .isEqualTo(of(2, 2, 2, 2));
    }

    @Test
    public void isPrime3_isTrue() {
        assertThat(isPrime(3))
                .isEqualTo(true);
    }
    
    @Test
    public void isPrime23_isTrue() {
        assertThat(isPrime(23))
                .isEqualTo(true);
    }
    
    @Test
    public void isPrime100_isFalse() {
        assertThat(isPrime(100))
                .isEqualTo(false);
    }

}