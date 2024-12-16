<?php
    $nums = [10,20,15,20,30,10,20];
    $colors = ["red"=>"แดง","green"=>"เขียว","black"=>"ดำ"];

    echo "<h1>array_key_exists()</h1>";
    if(array_key_exists("red",$colors)){ // ค้นหา key แล้วเก็บค่า boolean
        echo "มีคำศัพท์ สีแดง อยู่";
    }else{
        echo "ไม่มีคำศัพท์ ที่ค้นหา";
    }
    echo "<hr>";

    echo "<h1>in_array()</h1>";
    if(in_array(16,$nums)){ // ค้นหา value แล้วเก็บค่า boolean
        echo "พบเลขที่ค้นหา";
    }else{
        echo "ไม่พบเลขที่ค้นหา";
    }

?>