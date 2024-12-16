<?php
require('dbconnect.php');

$sql = "SELECT * FROM employee_info"; // เข้าถึงตารางในฐานข้อมูล

$result = mysqli_query($connect, $sql); // เข้าถึงคำสั่ง sql

$row = mysqli_fetch_object($result);
echo "<h1>สอบถามข้อมูลด้วย MYSQLI_NUM</h1>";
echo "รหัสพนักงาน = " . $row->id . "<br>"; // ดึงชื่อ column
echo "ชื่อพนักงาน = " . $row->fname . "<br>";
echo "นามสกุลพนักงาน = " . $row->lname . "<br>";
echo "<hr>";
