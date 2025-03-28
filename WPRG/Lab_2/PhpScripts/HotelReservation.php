<?php
$name = $_POST['name'];
$lastName = $_POST['lastName'];
$numberOfGuests = $_POST['numberOfGuests'];
$phoneNumber = $_POST['phoneNumber'];
$email = $_POST['email'];
$roomType = $_POST['roomType'];
$additionsList = $_POST['additionsList'];
$checkIn = $_POST['checkIn'];
$checkOut = $_POST['checkOut'];
$creditCardNumber = $_POST['creditCardNumber'];
$creditCardCode = $_POST['creditCardCode'];
$creditCardExpiry = $_POST['creditCardExpiry'];
$bedForChild = isset($_POST['bedForChild']) ? "Yes" : "No";
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Reservation table</title>
</head>
<body>
<div id="reservationTable">
    <table>
        <tr>
            <td>
                Name
            </td>
            <td>
                Last name
            </td>
            <td>
                Phone number
            </td>
            <td>
                Number of guests
            </td>
            <td>
                Email
            </td>
            <td>
                Bed For Child
            </td>
            <td>
                Room Type
            </td>
            <td>
                Additions List
            </td>
            <td>
                Check-In
            </td>
            <td>
                Check-Out
            </td>
            <td>
                Card Number
            </td>
            <td>
                Card Code
            </td>
            <td>
                Card Expiry Date
            </td>
        </tr>
        <tr>
            <td>
                <?php echo $name ?>
            </td>
            <td>
                <?php echo $lastName ?>
            </td>
            <td>
                <?php echo $phoneNumber ?>
            </td>
            <td>
                <?php echo $numberOfGuests ?>
            </td>
            <td>
                <?php echo $email ?>
            </td>
            <td>
                <?php echo $bedForChild ?>
            </td>
            <td>
                <?php echo $roomType ?>
            </td>
            <td>
                <?php echo $additionsList ?>
            </td>
            <td>
                <?php echo $checkIn ?>
            </td>
            <td>
                <?php echo $checkOut ?>
            </td>
            <td>
                <?php echo $creditCardNumber ?>
            </td>
            <td>
                <?php echo $creditCardCode ?>
            </td>
            <td>
                <?php echo $creditCardExpiry ?>
            </td>
        </tr>
    </table>
</div>
</body>

<style>

    td, th {
        text-align: center;
    }

    table {
        border-collapse: collapse;

    }

    table, th, td, tr {
        border: 2px solid black;
        font-size: 20px;
        background-color: forestgreen;

    }

    th,td{
        width: 90vh;
    }

    #reservationTable {
        display: flex;
        align-items: center;
        justify-content: center;
        height: 100vh;
        background-color: lightgreen;
    }



</style>