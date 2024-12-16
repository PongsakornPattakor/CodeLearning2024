<?php
    $arr1 = ["product"=>"โต๊ะ","color"=>"สีส้ม","price"=>500];
    $arr2 = ["discount"=>50,"delivery"=>120,"price"=>600];
    $arr3 = ["dog","cat","capybara"];
    $arr4 = ["หมา","แมว","คาปิบาร่า"];

    echo "<h1>array_merge</h1>";
    $arr_merge = array_merge($arr1,$arr2);
    print_r($arr_merge); // ถ้ามี key ซ้ำกัน จะเอา key ชุดหลังมาทับ
    
    echo "<hr>";
    
    echo "<h1>array_merge_recursive</h1>";
    $arr_merge_recursive = array_merge_recursive($arr1,$arr2);
    print_r($arr_merge_recursive); // ถ้า key ซ้ำกัน จะเอามาสร้าง arr ย่อย ข้างใน
    
    echo "<hr>";
    
    echo "<h1>array_combine</h1>";
    $arr_combine = array_combine($arr3,$arr4);
    print_r($arr_combine); // เอา arr ชุดแรกมาเป็น key และ arr ชุดสอง มาเป็น value
?>