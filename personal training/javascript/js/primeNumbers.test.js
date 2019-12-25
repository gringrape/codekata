const primeNumbers = require('./primeNumbers')

test('ofTests', () => {
   expect(primeNumbers.of(1)).toEqual([]);
   expect(primeNumbers.of(3)).toEqual([3]);
   expect(primeNumbers.of(4)).toEqual([2, 2]);
   expect(primeNumbers.of(16)).toEqual([2, 2, 2, 2]);
})

test('firstPrimeTests', () => {
   expect(primeNumbers.firstPrime(6)).toBe(2);
   expect(primeNumbers.firstPrime(10)).toBe(2);
   expect(primeNumbers.firstPrime(21)).toBe(3);
})