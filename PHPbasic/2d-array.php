<?php
    $products = array(
        array("คีย์บอร์ด","Keyboard",900),
        array("เมาส์","Mouse",1600),
        array("จอ","Monitor",5600)
    );
    print($products[1][1]);
    echo "<hr>";

    // เข้าถึงสมาชิก
    for($row=0 ; $row<count($products) ;$row++){
        print("แถวที่ ".($row+1)." ");
        for($col=0 ; $col<count($products[$row]) ; $col++){
            print $products[$row][$col]." ";
        }
        echo "<br>";
    };
?>