<?php

$num = 100.342;
$num2 = 57.56;

echo "<h1>ตัวเลขคือ</h1>";
echo $num . "<br>";
echo $num2 . "<hr>";

echo "<h1>ceil()</h1>";
$ceil = ceil($num);
echo "ปัดขึ้นทุกกรณี = $ceil";
echo "<hr>";

echo "<h1>floor()</h1>";
$floor = floor($num2);
echo "ปัดทิ้งทุกกรณี = $floor";
echo "<hr>";

echo "<h1>round()</h1>";
$round1 = round($num);
$round2 = round($num2);
echo "ปัดทิ้ง กรณี <5 = $round1" . "<br>";
echo "ปัดขึ้น กรณี >=5 = $round2";
echo "<hr>";
