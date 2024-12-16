<?php
    echo "<h1>เปรียบเทียบ String</h1>";

    $str1 = "PONGsakorn";
    $str2 = "pongsakorn";

    $strcmp = strcmp($str1,$str2); // คิด case มาเปรียบเทียบ
    echo "<h3>ใช้ strcmp() = </h3>".$strcmp;
    
    $strcasecmp = strcasecmp($str1,$str2);
    echo "<h3>ใช้ strcasecmp() = </h3>".$strcasecmp; // ไม่คิด case
    
    $str3 = "pongSAkorn";
    $str4 = "pongsakorn";
    
    $strspn = strspn($str3,$str4);
    echo "<h3>ใช้ strspn() = </h3>".$strspn; // หาจำนวนอักษรที่เหมือนกัน ถ้าพบไม่เหมือนกัน จะเลิกหา
    
    $strcspn = strcspn($str3,$str4);
    echo "<h3>ใช้ strspn() = </h3>".$strcspn; // หาจำนวนอักษรที่ไม่เหมือนกัน ถ้าพบเหมือนกัน จะเลิกหา
?>