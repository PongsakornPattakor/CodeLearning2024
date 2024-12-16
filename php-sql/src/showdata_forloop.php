<?php
require('dbconnect.php');

$sql = "SELECT * FROM employee_info";
$result = mysqli_query($connect, $sql);

$count = mysqli_num_rows($result); // ฟังก์ชั่นนับจำนวนแถวในฐานข้อมูล

for ($i = 0; $i < $count; $i++) {
    $row = mysqli_fetch_object($result);

    echo "รหัสพนักงาน = " . $row->id . "<br>"; // ดึงชื่อ column
    echo "ชื่อพนักงาน = " . $row->fname . "<br>";
    echo "นามสกุลพนักงาน = " . $row->lname . "<br>";
    echo "<hr>";
}
