<?php

// Zad 2 - Liczby Pierwsze
echo("Prime Numbers \n");
primeNumbers();
function primeNumbers()
{
    $n = 100;
    for ($i = 2; $i <= $n; $i++) {
        $k = $i ** (1 / 2);
        $m = floor($k);
        $o = true;
        for ($l = 2; $l <= $m; $l++) {
            if ($i % $l == 0) {
                $o = false;
                break;
            }
        }
        if ($o) {
            echo($i . " ");
        }
    }
    echo("\n\n");
}


//Zad 3 Ciąg Fibonacciego
echo("Fibonacci" . "\n");
fib(15);
function fib($n)
{

    $j = 1;
    $k = 1;
    $tab = array($j);

    for ($i = 1; $i < $n; $i++) {
        $l = $k + $j;
        $tab[] = $k;
        $j = $k;
        $k = $l;

    }

    foreach ($tab as $key => $value) {
        if ($value % 2 == 0) {
            echo("1. " . $value . "\n");
        }
    }
}


