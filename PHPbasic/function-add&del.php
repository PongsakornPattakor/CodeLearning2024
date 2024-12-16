<?php
    echo "<h1>Original arr</h1>";
    $fruits = ["มะละกอ","ฝรั่ง","กล้วย","ขนุน","มะม่วง","แตงโม"];
    print_r($fruits);
    echo "<hr>";
    
    // array_push
    echo "<h1>array_push</h1>";
    array_push($fruits,"<strong>มะเฟือง</strong>");
    print_r($fruits);
    echo "<hr>";
    
    // array_pop
    echo "<h1>array_pop</h1>";
    array_pop($fruits); // ลบมะเฟือง
    array_pop($fruits); // ลบแตงโม
    print_r($fruits);
    echo "<hr>";
    
    // array_unshift
    echo "<h1>array_unshift</h1>";
    array_unshift($fruits,"<strong>ส้ม</strong>"); // เพิ่มส้ม
    print_r($fruits);
    echo "<hr>";
    
    // array_shift
    echo "<h1>array_unshift</h1>";
    array_shift($fruits); // ลบส้ม
    print_r($fruits);
    echo "<hr>";
    
    // array_splice
    echo "<h1>array_splice</h1>";
    array_splice($fruits,1,2,array("แอปเปิ้ล","สตรอเบอรี่")); // ลบ ฝรั่ง กล้วย ขนุน ก่อน แล้วจึงแทรก แอปเปิ้ล สตรอเบอรี่
    print_r($fruits);
    echo "<hr>";
    ?>