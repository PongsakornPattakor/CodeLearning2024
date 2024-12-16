<?php
    $nums = [10,20,15,20,30,10,20];
    $colors = ["red"=>"แดง","green"=>"เขียว","black"=>"ดำ"];
    
    echo "<h1>Original arr</h1>";
    print_r($nums);
    echo "<br>";
    print_r($colors);
    echo "<hr>";
    
    echo "<h3>array_keys</h3>";
    $colors_key = array_keys($colors); // ดึง key
    print_r($colors_key);
    echo "<hr>";
    
    echo "<h3>array_values</h3>";
    $colors_value = array_values($colors); // ดึง value
    print_r($colors_value);
    echo "<hr>";
    
    echo "<h3>array_flip</h3>";
    $colors_fliped = array_flip($colors); // สลับ key เป็น value
    print_r($colors_fliped);
    echo "<hr>";
    
    echo "<h3>array_unique</h3>";
    $nums_unique = array_unique($nums);
    print_r($nums_unique);
    echo "<hr>";


?>