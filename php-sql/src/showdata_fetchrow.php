<?php
require('dbconnect.php');

$sql = "SELECT * FROM employee_info"; // เข้าถึงตารางในฐานข้อมูล

$result = mysqli_query($connect, $sql); // เข้าถึงคำสั่ง sql

$row = mysqli_fetch_row($result); // ได้ข้อมูลมาเป็น array แบบที่มีเลข index
echo "รหัสพนักงาน = " . $row[0] . "<br>";
echo "ชื่อพนักงาน = " . $row[1] . "<br>";
echo "นามสกุลพนักงาน = " . $row[2] . "<br>";
echo "<hr>";

$row = mysqli_fetch_row($result);
echo "รหัสพนักงาน = " . $row[0] . "<br>";
echo "ชื่อพนักงาน = " . $row[1] . "<br>";
echo "นามสกุลพนักงาน = " . $row[2] . "<br>";
echo "<hr>";

$row = mysqli_fetch_row($result);
echo "รหัสพนักงาน = " . $row[0] . "<br>";
echo "ชื่อพนักงาน = " . $row[1] . "<br>";
echo "นามสกุลพนักงาน = " . $row[2] . "<br>";
