<?php
    // array เดี่ยว
    echo "<h1>Array เดี่ยว</h1>";
    
    echo "<h2>สร้างด้วย []</h2>" ;
    $city = ["ภูเก็ต","ตรัง","นรา","สงขลา"]; // สร้างด้วย []
    print_r($city);
    
    echo "<h2>สร้างด้วย array(สมาชิก1,สมาชิก...)</h2>" ;
    $numbers = array(10,20,30,40); // สร้างด้วย array()
    print_r($numbers);
   
    echo "<h2>สร้างด้วย range(start,stop,step)</h2>" ; // สร้างด้วย range
    $count = range(1,15,2);
    print_r($count);
    echo "<hr>";
    
    // array จับคู๋ key => value
    echo "<h1>Array จับคู่</h1>";
    
    $rooms = array("A1"=>"เฟิร์ส","A2"=>"เอย","A3"=>"มิว");
    print_r($rooms["A2"]."<br>".$rooms["A3"]);
    echo "<hr>";
    
?>
