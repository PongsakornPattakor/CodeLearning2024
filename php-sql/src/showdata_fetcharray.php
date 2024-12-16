<?php
require('dbconnect.php');

$sql = "SELECT * FROM employee_info"; // เข้าถึงตารางในฐานข้อมูล

$result = mysqli_query($connect, $sql); // เข้าถึงคำสั่ง sql

$row_num = mysqli_fetch_array($result, MYSQLI_NUM); // สอบถามข้อมูลจากตาราง แล้วส่งข้อมูลกลับมาโดย index เป็นตัวเลข
echo "<h1>สอบถามข้อมูลด้วย MYSQLI_NUM</h1>";
echo "รหัสพนักงาน = " . $row_num[0] . "<br>";
echo "ชื่อพนักงาน = " . $row_num[1] . "<br>";
echo "นามสกุลพนักงาน = " . $row_num[2] . "<br>";
echo "<hr>";

$row_assoc = mysqli_fetch_array($result, MYSQLI_ASSOC); // สอบถามข้อมูลจากตาราง แล้วส่งข้อมูลกลับมาโดย index เป็น key
echo "<h1>สอบถามข้อมูลด้วย MYSQLI_ASSOC</h1>";
echo "รหัสพนักงาน = " . $row_assoc["id"] . "<br>";
echo "ชื่อพนักงาน = " . $row_assoc["fname"] . "<br>";
echo "นามสกุลพนักงาน = " . $row_assoc["lname"] . "<br>";
echo "<hr>";

$row_both = mysqli_fetch_array($result, MYSQLI_BOTH); // สอบถามข้อมูลจากตาราง แล้วส่งข้อมูลกลับมาโดย index สามารถเป็นได้ทั้งเลข หรือ key
echo "<h1>สอบถามข้อมูลด้วย MYSQLI_ASSOC</h1>";
echo "รหัสพนักงาน = " . $row_both["id"] . "<br>"; // index แบบ key
echo "ชื่อพนักงาน = " . $row_both[1] . "<br>"; // index แบบ ตัวเลข
echo "นามสกุลพนักงาน = " . $row_both["lname"] . "<br>";
echo "<hr>";
