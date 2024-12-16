<?php
    // เข้าถึง สมาชิกใน array แบบเดี่ยว
    echo "<h1>เข้าถึงสมาชิก ใน array แบบเดี่ยว</h1>";
    $fruits = ["ส้ม","มะละกอ","กล้วย","ลิ้นจี่","มะเฟือง","ขนุน","กล้วย","กล้วย"];
    $count = count($fruits); // นับจน.สมาชิก
    
    echo "<h2>เข้าถึงสมาชิกแต่ละตัว</h2>";
    echo "<strong>ในแผงมีผลไม้</strong> ".$count." <strong>ชนิด</strong><br>";
    for($i=0 ; $i<$count ; $i++){
        echo "ผลไม้ชนิดที่ ".($i+1)." คือ ".$fruits[$i];
        echo "<br>";
    }
    echo "<hr>";
    
    echo "<h2>นับจำนวนสมาชิกที่ซ้ำกัน</h2>";
    print_r(array_count_values($fruits)); // นับจำนวนสมาชิกที่ซ้ำกัน นั่นคือ กล้วย
    echo "<hr>";
    echo "<hr>";
    
    // เข้าถึง สมาชิกใน array แบบจับคู๋
    echo "<h1>เข้าถึงสมาชิก ใน array แบบจับคู่</h1>";
    $animals = ["dog"=>"หมา","cat"=>"แมว","rat"=>"หนู","horse"=>"ม้า"];

    foreach($animals as $key => $value){
        echo "สัตว์ชนิด $key คือ $value<br>";
    }
?>