// 목적
// - 인수분해 하는 클래스를 선언 한다.
// - 함수를 property로 넣어주고 export 해준다.

let primeNumbers = {
    of(num) {
        if(num < 2) return []

        let result = []
        if(this.isPrime(num)) result.push(num)
        else {
            for (var i = 2; i < num; i++) {
                if (num % i == 0) {
                    result.push(i)
                    for (let item of this.of(num / i)) {
                        result.push(item)
                    }
                    break
                }
            }
        }
        return result
    },
    isPrime(num) {
        for (let i = 2; i < num; i++) {
            if (num % i === 0) {
                return false
            }
        }    
        return true   
    }
}

module.exports = primeNumbers