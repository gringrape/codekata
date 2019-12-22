const primeNumbers = require('./primeNumbers')

test('of1_isNone', () => {
   expect(primeNumbers.of(1)).toEqual([]);
})

test('of2_is2', () => {
   expect(primeNumbers.of(2)).toEqual([2]);
})

test('of3_is3', () => {
   expect(primeNumbers.of(3)).toEqual([3]);
})

test('of4_is22', () => {
   expect(primeNumbers.of(4)).toEqual([2, 2]);
})

test('of-1_isNone', () => {
   expect(primeNumbers.of(-1)).toEqual([]);
})

test('of6_is23', () => {
   expect(primeNumbers.of(6)).toEqual([2, 3]);
})

test('of8_is222', () => {
   expect(primeNumbers.of(8)).toEqual([2, 2, 2]);
})

test('of12_is223', () => {
   expect(primeNumbers.of(12)).toEqual([2, 2, 3]);
})

test('of200_is22255', () => {
    expect(primeNumbers.of(200)).toEqual([2, 2, 2, 5, 5])
})

test('isPrime3_isTrue', () => {
   expect(primeNumbers.isPrime(3)).toBe(true);
})

test('isPrime4_isFalse', () => {
   expect(primeNumbers.isPrime(4)).toBe(false);
})

test('isPrime97_isTrue', () => {
   expect(primeNumbers.isPrime(97)).toBe(true);
})