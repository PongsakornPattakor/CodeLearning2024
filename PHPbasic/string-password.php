<?php

$pass = "First09";

echo "<h1>รหัสผ่านคือ = $pass</h1>";

echo  "<h2>md5()</h2>";
$md5 = md5($pass);
echo "md5 = " . $md5;
echo "<hr>";

echo  "<h2>sha1()</h2>";
$sha1 = sha1($pass);
echo "sha1 = " . $sha1;
echo "<hr>";

echo  "<h2>crypt()</h2>";
$crypt = crypt($pass, "..dk");
echo "crypt = " . $crypt;
echo "<hr>";

echo  "<h2>base64_encode()</h2>";
$encode = base64_encode($pass);
echo "encode = " . $encode;
echo "<hr>";

echo  "<h2>base64_decode()</h2>";
$decode = base64_decode($encode);
echo "decode = " . $decode;
echo "<hr>";
