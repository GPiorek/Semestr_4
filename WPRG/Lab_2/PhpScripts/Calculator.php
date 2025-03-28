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
    $message = "U cant divide by zero";
} else {
    $message = "Result of operation is<br><br>" . $firstNumber . " " . $operationSign . " " . $secondNumber . " = " . $result;
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
</head>
<body>
<div id="resultOfOperation">
    <div id="messageBlock">
        <?php echo $message ?>
    </div>
</div>
</body>
</html>

<style>
    #resultOfOperation {
        display: flex;
        align-items: center;
        justify-content: center;
        font-size: 30px;
        background-color: #4cdec8;
        height: 100vh;
    }

    #messageBlock {
        display: flex;
        align-items: center;
        justify-content: center;
        height: 30%;
        width: 30%;
        background-color: rgba(0, 0, 0, 0.5);
        border-radius: 30px;
    }
</style>