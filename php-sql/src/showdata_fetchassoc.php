<?php
require('dbconnect.php');

$sql = "SELECT * FROM employee_info"; // เข้าถึงตารางในฐานข้อมูล

$result = mysqli_query($connect, $sql); // เข้าถึงคำสั่ง sql

$row = mysqli_fetch_assoc($result); // ได้ข้อมูลมาเป็น array แบบที่มี key และ value
echo "รหัสพนักงาน = " . $row["id"] . "<br>";
echo "ชื่อพนักงาน = " . $row["fname"] . "<br>";
echo "นามสกุลพนักงาน = " . $row["lname"] . "<br>";
echo "<hr>";

$row = mysqli_fetch_assoc($result);
echo "รหัสพนักงาน = " . $row["id"] . "<br>";
echo "ชื่อพนักงาน = " . $row["fname"] . "<br>";
echo "นามสกุลพนักงาน = " . $row["lname"] . "<br>";
echo "<hr>";

$row = mysqli_fetch_assoc($result);
echo "รหัสพนักงาน = " . $row["id"] . "<br>";
echo "ชื่อพนักงาน = " . $row["fname"] . "<br>";
echo "นามสกุลพนักงาน = " . $row["lname"] . "<br>";
echo "<hr>";
