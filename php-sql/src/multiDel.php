<?php
require('dbconnect.php');

$id_arr = $_POST["idCheck"];

$multiId = implode(",", $id_arr);

$sql = "DELETE FROM employee_info WHERE id in ($multiId)";

$result = mysqli_query($connect, $sql);

if ($result) {
    header("location:showDataTable.php");
}
