//ฟังก์ชั่นแบบกำหนดค่าเริ่มต้น
function fullName(fname,lname,city="Phuket"){ //กำหนด city ด้วยค่าเริ่มต้น ถ้าไม่มี argument ส่งมา จะใช้ค่าเริ่มต้น
    console.log("ชื่อจริง:",fname,"นามสกุล:",lname);
    console.log("ที่อยู่:",city)
}

fullName("First","Pat","Phuket");
fullName("Eay","Thep","Nara");
fullName("Boy","Phak");