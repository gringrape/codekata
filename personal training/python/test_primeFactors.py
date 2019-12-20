import primeFactors

def test_of1_isNone():
    assert primeFactors.of(1) == []

def test_of2_is2():
    assert primeFactors.of(2) == [2]

def test_of4_is22():
    assert primeFactors.of(4) == [2, 2]

def test_isPrime1_isFalse():
    assert not primeFactors.isPrime(1)

def test_isPrime23_isTrue():
    assert primeFactors.isPrime(23)

def test_isPrime2278_isFalse():
    assert not primeFactors.isPrime(2278)