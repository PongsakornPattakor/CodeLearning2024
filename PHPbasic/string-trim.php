<?php
    echo "<h1>การตัดช่องว่างด้วย trim()</h1>";
    
    $str1 = "         Pongsakorn    ";
    $trimed_str1 = trim($str1);
    echo "ก่อนตัดช่องว่าง มีความยาว ".strlen($str1);
    echo "<br>";
    echo "หลังตัดช่องว่าง มีความยาว ".strlen($trimed_str1);
    
    echo "<h1>การตัดช่องว่างด้วย ltrim()</h1>";
    $left_trimed = ltrim($str1); // ตัดช่องว่างทางซ้าย
    echo "ก่อนตัดช่องว่าง มีความยาว ".strlen($str1);
    echo "<br>";
    echo "หลังตัดช่องว่างทางซ้าย มีความยาว ".strlen($left_trimed);
    
    echo "<h1>การตัดช่องว่างด้วย rtrim()</h1>";
    $right_trimed = rtrim($str1); // ตัดช่องว่างทางขวา
    echo "ก่อนตัดช่องว่าง มีความยาว ".strlen($str1);
    echo "<br>";
    echo "หลังตัดช่องว่างทางซ้าย มีความยาว ".strlen($right_trimed);
?>