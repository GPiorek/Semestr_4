<?php

// Zad 2 - Liczby Pierwsze
echo("Prime Numbers \n");

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


