<?php

$str = "Hello PHP , Hello JavaScript";
$str2 = "Mother";

echo "<h1>ข้อความเดิม =  </h1>";
echo "<h3>$str<br>$str2</h3>";

echo "<h1>str_replace()</h1>";
$str_replace = str_replace("Hello", "สวัสดี", $str);
echo "หลังแทนที่ = " . $str_replace . "<br>";

echo "<h1>strrev()</h1>";
$strrev = strrev($str2);
echo "หลังย้อนกลับข้อความ = " . $strrev;

echo "<h1>str_repeat()</h1>";
$str_repeat = str_repeat($str2, 5);
echo "หลังทำซ้ำข้อความ = " . $str_repeat;
