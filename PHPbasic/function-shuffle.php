<?php
    $alph = ["ภูเก็ต","ระนอง","ชุมพร","พังงา","กระบี่"];
    print_r($alph);
    echo "<br>";
    shuffle($alph); //สลับค่า
    print_r($alph);
    echo "<br>";
    
    $num = [10,20,1,28,7,98,66,43];
    print_r($num);
    echo "<br>";
    $num = array_reverse($num);
    print_r($num);
?>