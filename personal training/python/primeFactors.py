# from definedException import BoundaryException

def of(num):
    try:
        if isPrime(num):
            return [num]
    except BoundaryException:
        return []

    primes = []
    for i in range(2, num):
        if num % i == 0:
            primes.append(i)
            primes.append(int(num / i))
            break
    return primes

def isPrime(num):
    if num < 2:
        raise BoundaryException("Out of boundary")
    for i in range(2, num):
        if num % i == 0:
            return False
    return True

