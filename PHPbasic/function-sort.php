<?php
    // การเรียงแบบเดี่ยว
    $num = [10,20,1,28,7,98,66,43];
    $alph = ["ภูเก็ต","ระนอง","ชุมพร","พังงา","กระบี่"];

    echo "<h1>การเรียงด้วย sort() แบบเดี่ยว</h1>";
    sort($num);
    sort($alph);

    print_r($num);
    echo "<br>";
    print_r($alph);
    
    echo "<hr>";
    
    echo "<h1>การเรียงด้วย rsort() แบบเดี่ยว</h1>";
    rsort($num);
    rsort($alph);
    
    print_r($num);
    echo "<br>";
    print_r($alph);
    
    echo "<hr>";
    echo "<hr>";
    
    // การเรียงแบบจับคู่
    $grade = ["B"=>32,"A"=>64,"D"=>1,"C"=>91];
    $lang = ["JP"=>"ญี่ปุ่น","US"=>"สหรัฐ","TH"=>"ไทย","KR"=>"เกาหลี"];
    
    echo "<h1>การเรียงด้วย asort() แบบจับคู่</h1>";
    asort($grade);
    asort($lang);
    
    print_r($grade);
    echo "<br>";
    print_r($lang);
    
    echo "<hr>";
    
    echo "<h1>การเรียงด้วย ksort() แบบจับคู่</h1>";
    ksort($grade);
    ksort($lang);
    
    print_r($grade);
    echo "<br>";
    print_r($lang);
    
    echo "<hr>";
?>