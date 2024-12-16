<?php
    $total1 = null;
    $total2 = "";
    $total3 = 0;
    $total4 = "First";
    $total5 = "Pongsakorn";
    
    echo "<h1>ตัวแปรปกติ</h1>";
    echo "ตัวแปรของ total1 = ".$total1."<br>";
    echo "ตัวแปรของ total2 = ".$total2."<br>";
    echo "ตัวแปรของ total3 = ".$total3."<br>";
    echo "ตัวแปรของ total4 = ".$total4."<br>";
    
    echo "<hr>";
    echo "<h1>isset()</h1>";
    // isset : คือถามว่ามีการกำหนดค่าลงไปไหม
    echo "ใช้ isset = ".isset($total1)."<br>";
    echo "ใช้ isset = ".isset($total2)."<br>";
    echo "ใช้ isset = ".isset($total3)."<br>";
    echo "ใช้ isset = ".isset($total4)."<br>";
    
    echo "<hr>";
    echo "<h1>unset()</h1>";
    // unset : ยกเลิกการกำหนดตัวแปร
    unset($total4);
    echo "ใช้ unset = ".$total4."<br>";
    
    echo "<hr>";
    echo "<h1>empty()</h1>";
    // empty : คือถามว่าตัวแปรนี้เป็นค่าว่างหรือไม่ ถ้าเป็น จะ = 1
    echo "ใช้ empty = ".empty($total1)."<br>";
    echo "ใช้ empty = ".empty($total2)."<br>";
    echo "ใช้ empty = ".empty($total3)."<br>";
    echo "ใช้ empty = ".empty($total4)."<br>";
    echo "ใช้ empty = ".empty($total5)."<br>";
    
    echo "<hr>";
    echo "<h1>is_null()</h1>";
    // is_null : ถามว่าตัวแปรนี้เป็นค่า null หรือไม่ ถ้าเป็น จะ = 1
    echo "ใช้ is_null = ".empty($total1)."<br>";
    echo "ใช้ is_null = ".empty($total5)."<br>";
    
    echo "<hr>";
    echo "<h1>var_dump()</h1>";
    // var_dump() : แสดงรายละเอียดของตัวแปรแต่ละตัว
    echo var_dump($total1)."<br>"; 
    echo var_dump($total2)."<br>";
    echo var_dump($total3)."<br>"; 
    echo var_dump($total5)."<br>"; 
    ?>