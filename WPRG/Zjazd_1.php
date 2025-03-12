<?php
//Zad 1 - Tablica owoców
$fruits = array("Orange", "Pomegranate", "Banana");

$firstFruit[] = array($fruits[0]);
$secondFruit[] = $fruits[1];
$thirdFruit[] = $fruits[2];

foreach ($fruits as $fruit) {
    $firstLetter = $fruit[0];
    if ($firstLetter === "P") {
        echo "First letter of " . $fruit . " is P";
    }
    $length = 0;
    $newWord =
    while (true) {
        $i = 0;
        if ($length === $fruit[$i]){

        }

//        $char = $fruit[$i];
//        if ($char != "") {
//            $n = 0;
//            $c = $char;
//            $n++;
//        }
//        $i++;
//        if ($char == "") {
//            break;
//        }
    }
    print_r($newArray);
}


echo "\n\n";


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
/*
//Zad 4 Tablica z tekstu
$var = "Lorem. Ipsum. is. simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a
 galley of type and scrambled it to make a type specimen book. It has survived not only five
 centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was
 popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages,
 and more recently with desktop publishing software like Aldus PageMaker including versions of
 Lorem Ipsum.";

$array = explode(" ", $var);
foreach ($array as $key => $value) {
    $i = 0;
    while (true) {
        $v = $value;
        $char = $v[$i];
        if ($char == "." || ",") {
            echo "teeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee";
        }
        $i++;
        if ($char == "") {
            break;
        }
    }
}
print_r($array);
*/



