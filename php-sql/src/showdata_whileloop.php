<?php
require('dbconnect.php');

$sql = "SELECT * FROM employee_info"; // เข้าถึงตารางในฐานข้อมูล
$result = mysqli_query($connect, $sql); // เข้าถึงคำสั่ง sql

while ($row = mysqli_fetch_assoc($result)) { // เช็คว่ามีแถวให้ดึงไหม
    echo "รหัสพนักงาน = " . $row["id"] . "<br>";
    echo "ชื่อพนักงาน = " . $row["fname"] . "<br>";
    echo "นามสกุลพนักงาน = " . $row["lname"] . "<br>";
    echo "<hr>";
}
