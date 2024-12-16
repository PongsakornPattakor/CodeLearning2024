<?php
date_default_timezone_set("Asia/Bangkok");

echo "<h1>date()</h1>";
echo date("r") . "<br>";
echo date("l") . "<br>";
echo date("j F Y") . "<br>";
echo date("h:i:s A") . "<br>";
echo date("d/m/y");

echo "<hr>";

echo "<h1>time()</h1>";
echo time() . "<br>";
echo date("d/m/y", time()) . "<br>";

$day3 = time() + (60 * 60 * 24 * 3);
echo "3 วันข้างหน้าคือ = " . date("d/m/y", $day3);

echo "<hr>";

echo "<h1>getdate()</h1>";
$date_time = getdate();

echo "วันที่ =  " . $date_time["mday"] . "<br>";
echo "วัน =  " . $date_time["weekday"] . "<br>";
echo "เดือน = " . $date_time["month"] . "<br>";
echo "ปี = " . $date_time["year"];

echo "<hr>";

echo "<h1>checkdate()</h1>";
$result = checkdate(10, 25, 2024); // ตรวจสอบรูปแบบวัน
if ($result) {
    echo "วันที่ถูกต้อง";
} else {
    echo "วันที่ไม่ถูกต้อง";
}
