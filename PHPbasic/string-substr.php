<?php

// substr()
echo "<h1>substr()</h1>";
$txt = "pongsakorn";
echo "ก่อนหั่น str = " . $txt . "<br>";

$new_text = substr($txt, 3, 4);
echo "หลังหั่น str = " . $new_text;

echo "<hr>";

// str_split()
echo "<h1>str_split()</h1>";
$alphabet = "ABCDEFGHIJK";
echo "ก่อนหั่น = " . $alphabet . "<br>";

$new_alphabet = str_split($alphabet, 3); // หั่นแล้วเก็บเป็น array ทีละ 3 ตัวอักษร
print_r($new_alphabet);
