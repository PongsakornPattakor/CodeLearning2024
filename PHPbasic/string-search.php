<?php
$str = "Hello PHP";

echo "<h1>strstr()</h1>";
echo "ข้อความคือ " . $str . "<br>";
$strstr = strstr($str, "hello");

if ($strstr) {
    echo "ค้นหา hello ด้วย strstr() = พบข้อความ";
} else {
    echo "ค้นหา hello ด้วย strstr() = ไม่พบข้อความ";
}

echo "<hr>";

echo "<h1>stristr()</h1>";
echo "ข้อความคือ " . $str . "<br>";
$stristr = stristr($str, "hello");

if ($stristr) {
    echo "ค้นหา hello ด้วย stristr() = พบข้อความ";
} else {
    echo "ค้นหา hello ด้วย stristr() = ไม่พบข้อความ";
}
