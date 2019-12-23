package primeFactors;

import org.junit.Test;

import java.util.List;

import static java.util.List.of;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class PrimeFactorsTests {

    // 테스트는 만들고자 하는 단위를 명세하는 역할을 한다.

    @Test
    public void ofNegative1_isNone() {

        assertThat(PrimeFactors.of(-1))
                .isEqualTo(List.of());

    }

    @Test
    public void of1_isNone() {
        assertThat(PrimeFactors.of(1))
                .isEqualTo(of());
    }

    @Test
    public void of2_is2() {
        assertThat(PrimeFactors.of(2))
                .isEqualTo(List.of(2));

    }

    @Test
    public void of3_is3() {
        assertThat(PrimeFactors.of(3))
                .isEqualTo(List.of(3));

    }

    @Test
    public void of4_is22() {
        assertThat(PrimeFactors.of(4))
                .isEqualTo(of(2, 2));

    }

    @Test
    public void of6_is23() {
        assertThat(PrimeFactors.of(6))
                .isEqualTo(of(2, 3));
    }

    @Test
    public void of8_is222() {
        assertThat(PrimeFactors.of(8))
                .isEqualTo(of(2, 2, 2));
    }

    @Test
    public void of16_is2222() {
        assertThat(PrimeFactors.of(16))
                .isEqualTo(of(2, 2, 2, 2));
    }

    @Test
    public void findMinPrime25_is5() {
        assertThat(PrimeFactors.findMinPrime(25))
                .isEqualTo(5);
    }
    
    @Test
    public void findMinPrime7_is7() {
        assertThat(PrimeFactors.findMinPrime(7))
                .isEqualTo(7);
        
    }
    
    @Test
    public void findMinPrime16_is2() {
        assertThat(PrimeFactors.findMinPrime(16))
                .isEqualTo(2);
        
    }
}