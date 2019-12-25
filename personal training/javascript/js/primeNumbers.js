const primeNumbers = {
    of(num) {

        if (num < 2) return []

        let result = []

        let minPrime = this.firstPrime(num)
        result.push(minPrime)
        for (el of this.of(num / minPrime)) {
            result.push(el)
        }

        return result
    },
    firstPrime(num) {
        
        for (var i = 2; i < num + 1; i++) {
            if (num % i == 0) return i
        }

    }
}

module.exports = primeNumbers