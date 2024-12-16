<?php
    $price = 50; 
    $weight = 68.5;
    $name = "First";
    $isValid = true;

    echo $name."<br>";
    echo "น้ำหนัก ".$weight."<br>"; // . เป็นการต่อ String

    echo "<hr>";

    echo "ชนิดข้อมูล คือ ".gettype($weight)."<br>";
    echo "ชนิดข้อมูล คือ ".gettype($isValid)."<br>";

    echo "<hr>";

    echo "ก่อนเปลี่ยน คือ ".gettype($weight)."<br>";
    settype($weight,"integer")."<br>";
    echo "หลังเปลี่ยน คือ ".gettype($weight)."<br>";
    
?>