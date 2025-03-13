<?php
error_reporting(0);
//Zad 1 - Tablica owoców
echo "Flipped array\n";

fruits();
function fruits()
{
    $fruits = array("Orange", "Pomegranate", "Banana");


    foreach ($fruits as $fruit) {
        $firstLetter = $fruit[0];
        if ($firstLetter === "P") {
            echo "First letter of " . $fruit . " is P\n";
        }
        $i = 0;
        $length = 0;
        while (true) {
            if ($fruit[$i] != "") {
                $length++;
                $i++;
            }
            if ($fruit[$i] == "") {
                break;
            }
        }
        $k = $length - 1;
        $flippedFruit = "";
        while (true) {
            if ($fruit[$k] != "") {
                $flippedFruit .= $fruit[$k];
                $k--;
            }
            if ($k == -1) {
                $flippedFruits[] = $flippedFruit;
                break;
            }
        }
    }
    print_r($flippedFruits);
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
//
//    print_r($newArray);
//}


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

    $i = 1;
    foreach ($tab as $key => $value) {
        if ($value % 2 == 0) {
            echo($i . ". " . $value . "\n");
            $i++;
        }
    }
}

//Zad 4 Tablica z tekstu
echo "\nTablica z tekstu\n";
arrayFunction();
//TODO ROZLACZANIE I PRZYLACZANIE
function arrayFunction()
{
    $var = "Lorem. Ipsum. is. simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a
 galley of type and scrambled it to make a type specimen book. It has survived not only five
 centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was
 popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages,
 and more recently with desktop publishing software like Aldus PageMaker including versions of
 Lorem Ipsum.";


    $array = explode(" ", $var);
    foreach ($array as $arr) {
        $newArr = "";
        $length = 0;
        while (true) {
            if ($arr[$length] == "") {
                break;
            }
            $length++;
        }
        $i = 0;
        for ($j = $i; $j < $length; $j++) {
            if ($j = $length) {
                for ($k = 0; $k < $j; $k++) {
                    if ($arr[$k] == "." || $arr[$k] == ",") {
                        break;
                    }
                    $newArr .= $arr[$k];
                }
                $connectedArr[] = $newArr;
            }
        }

    }
    for ($i = 0; $i < count($connectedArr) - 1; $i++) {
        $finalArray[$connectedArr[$i]] = $connectedArr[$i += 1];
    }
    print_r($finalArray);
}

//
//$j = $var.count();
//while (true) {
//    $array[] = $var[0];
//    if ($var[$i] == "") {
//    }
//}
//print_r($array);
////foreach ($array as $key => $value) {
////    $i = 0;
////    while (true) {
////        $v = $value;
////        $char[] = $v[$i];
////        if ($char == "." || ",") {
////
////        }
////        $i++;
////        if ($char == "") {
////            break;
////        }
////    }
////}

////$array = explode(" ", $var);
//
//
//
//
//
//
//
