<?php
$firstNumber = $_POST['firstNumber'];
$secondNumber = $_POST['secondNumber'];
$operationSign = $_POST['operation'];
$operation = (int)$_POST['operation'];

switch ($operationSign) {
    case '+':
        $result = $firstNumber + $secondNumber;
        break;
    case '-':
        $result = $firstNumber - $secondNumber;
        break;
    case '*':
        $result = $firstNumber * $secondNumber;
        break;
    case '/':
        $result = $firstNumber / $secondNumber;
        break;
}
if ($firstNumber == 0 && $operationSign == "/" || $secondNumber == 0 && $operationSign == "/") {
    echo "U cant divide by zero";
} else {
    echo "Result of operation<br>";
    echo $firstNumber . " " . $operationSign . " " . $secondNumber . " = " . $result;

}
