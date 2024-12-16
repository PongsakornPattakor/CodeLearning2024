<?php
    $x = 100;

    function show() {
        global $x; // ถ้าจะเรียกใช้ตัวแปร global นอก function ต้องระบุ global ด้วย
        $GLOBALS ["z"] = 300; //การทำให้ local v กลายเป็น global v เพื่อไปใช้งานด้านนอก
        print("ตัวแปร x คือ".$x."<br>");
    }
    show();
    print("ตัวแปร z คือ".$z);
?>