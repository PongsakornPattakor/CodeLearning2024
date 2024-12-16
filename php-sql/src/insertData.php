<?php
// เชื่อมต่อฐานข้อมูล
require('dbconnect.php'); // import ไฟล์มาใช้

// รับค่าจาก form
$fname = $_POST["fname"];
$lname = $_POST["lname"];
$gender = $_POST["gender"];
$age = $_POST["age"];
$email = $_POST["email"];
$skills = implode(",", $_POST["skills"]); // แปลง จาก arr เป็น string ก่อน เพื่อที่จะเอาไปเก็บในฐานข้อมูล

// บันทึกข้อมูล
$sql = "INSERT INTO employee_info(fname,lname,gender,age,email,skills) VALUES('$fname','$lname','$gender','$age','$email','$skills')";

$result = mysqli_query($connect, $sql);
if ($result) {
    header("location:register.php");
} else {
    echo mysqli_error($connect);
}
