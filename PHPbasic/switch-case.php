<?php
    $year = 1;

    switch($year){
        case 2 : echo "ดอกเบี้ย 1.25%"."<br>";
            break;
        case 3 : echo "ดอกเบี้ย 1.5%"."<br>";
            break;
        case 4 : echo "ดอกเบี้ย 1.75%"."<br>";
            break;
        case 5 : echo "ดอกเบี้ย 2.2%"."<br>";
            break;
        default : // ทำงานในกรณีที่ไม่เข้าเงื่อนไขไหนเลย
            if($year>5){
                echo "ดอกเบี้ยคงที่ 2.2%";
            }else if($year<2) echo "ฝากไม่ครบระยะเวลาที่กำหนด";
    }
    
    
?>