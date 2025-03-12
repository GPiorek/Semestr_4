import math
from timeit import default_timer as timer


def f1(n):
    s = 0;
    for j in range(1, n):
        s = s + 1 / j
    return s


def f2(n):
    s = 0;
    for j in range(1, n):
        for k in range(1, n):
            s = s + k / j
    return s


def f3(n):
    s = 0;
    for j in range(1, n):
        for k in range(j, n):
            s = s + k / j
    return s


def f4(n):
    s = 0;
    for j in range(1, n):
        k = 2
        while k <= n:
            s = s + k / j
            k = k * 2
    return s


def f5(n):
    s = 0;
    k = 2
    while k <= n:
        s = s + 1 / k
        k = k * 2
    return s


nn = [2000, 4000, 8000, 16000, 32000]

for n in nn:
    start = timer()
    f1(n)
    stop = timer()
    Tn = stop - start
    Fn = n
    print(n, Tn, Fn / Tn)

# inne funkcje czasu:

# Fn=math.log(n,2)
# Fn=n
# Fn=100*n
# Fn=n*math.log(n,2)
# Fn=n*n