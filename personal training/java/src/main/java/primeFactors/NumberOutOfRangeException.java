package primeFactors;

public class NumberOutOfRangeException extends RuntimeException {

    public NumberOutOfRangeException(Integer num) {
        super("number is out of boundary: " + num);
    }

}
