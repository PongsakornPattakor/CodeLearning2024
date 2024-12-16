<?php
    echo "<h1>หาความยาว String</h1>";

    $name = "Pongsakorn";
    $lname = "   Pongsakorn   "; // ถ้ามีเว้นวรรค จะนับรวมวรรคไปด้วย

    $count = strlen($name);
    echo "ความยาวของ ".$name." คือ ".$count;
    echo "<br>";
    
    $count2 = strlen($lname);
    echo "ความยาวของ ".$lname." แบบมีการเว้นวรรค คือ ".$count2;
    
?>