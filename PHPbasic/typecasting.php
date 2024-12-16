<?php
    $price = 100.51;
    $delevery = 50.48;

    $total = $price + $delevery;

    echo "ราคาทั้งหมด คือ ".$total."<br>";
    echo gettype($total)."<br>";
    
    // Type casting
    $total = (integer)$total;
    echo "ราคาทั้งหมด คือ ".$total."<br>";
    echo gettype($total);

?>