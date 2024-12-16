<?php
    // คำนวณเกรด
    $score = 101;
    $grade = "";

    if($score<50 && $score>=0){
        $grade = "F";
        echo "เกรดที่ได้ คือ ".$grade."<br>";
    }else if($score>=50 && $score<60){
        $grade = "D";
        echo "เกรดที่ได้ คือ ".$grade."<br>";
    }else if($score>=60 && $score<70){
        $grade = "C";
        echo "เกรดที่ได้ คือ ".$grade."<br>";
    }else if($score>=70 && $score<80){
        $grade = "B";
        echo "เกรดที่ได้ คือ ".$grade."<br>";
    }else if($score>=80 && $score<=100){
        $grade = "A";
        echo "เกรดที่ได้ คือ ".$grade."<br>";
    }else{
        echo "คะแนนที่ป้อนไม่ถูกต้อง";
    }

?>