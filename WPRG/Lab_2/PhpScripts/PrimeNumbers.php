<?php


$inputNumber = (int)$_POST['inputPrimeNumber'];
//Loop from first lab
if ($inputNumber > 0) {
    for ($i = 2; $i <= $inputNumber; $i++) {
        $k = $i ** (1 / 2);
        $m = floor($k);
        $o = true;
        for ($l = 2; $l <= $m; $l++) {
            if ($i % $l == 0) {
                $o = false;
                break;
            }
        }
    }
    switch ($o) {
        case true:
            $resultMessage = $inputNumber . " is prime number";
            break;
        case false:
            $resultMessage = $inputNumber . " is not Prime number";
            break;
    }
} else {
    echo $inputNumber . " is not positive number";
}
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Prime numbers result</title>
</head>
<body>
<div class="page" id="page">
    <div class="resultMessage" id="resultMessage">
        <a><?php echo $resultMessage ?></a><br>
        <a><?php echo "Itterations of loop " . $i - 2 ?></a><br>
    </div>
</div>
</body>
</html>

<style>
    .page {
        font-size: 20px;
        background-color: moccasin;
        height: 100vh;
        display: flex;
        align-items: center;
        justify-content: center;
    }
    .resultMessage{
        height: 20%;
        width: 20%;
        background-color: rgba(0,0,0,0.3);
        border-radius: 10px;
        align-items: center;
        justify-content: center;
        display: flex;
        flex-direction: column;
    }

</style>

