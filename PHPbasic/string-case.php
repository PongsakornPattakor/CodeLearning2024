<?php
    echo "<h1>แปลงอักษร</h1>";

    $str1 = "hello world  i love php";
    $str2 = "THIS IS COMPUTER";

    echo "ก่อนแปลงอักษร = ".$str1;
    echo "<br>";
    echo "ก่อนแปลงอักษร = ".$str2;
    echo "<hr>";

    $upper = strtoupper($str1);
    echo "ทำให้ใหญ่ขึ้นทั้งหมด = ".$upper;
    echo "<br>";
    
    $lower = strtolower($str2);
    echo "ทำให้เล็กลงทั้งหมด = ".$lower;
    echo "<br>";
    
    $capital = ucwords($str1);
    echo "ทำให้ตัวแรกของคำ ใหญ่ = ".$capital;
    echo "<br>";
    
    $wordfirst = ucfirst($str1);
    echo "ทำให้ตัวแรกของข้อความ ใหญ่ = ".$wordfirst;
    echo "<br>";
    ?>