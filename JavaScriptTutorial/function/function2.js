// ฟังก์ชันที่มีการรับค่าเข้ามาทำงาน
function plusNum(x){
    console.log("ค่าแรกที่ส่งมา",x);
}
plusNum(5);

let number =200;
plusNum(number);

function fullName(fname,lname){
    console.log("ชื่อจริง :",fname,"นามสกุล :",lname);
}

fullName("Pongsakorn","Pattakor");

function sum(a,b,c){
    let result = a+b+c;
    console.log("ผลบวกของทั้ง 3 ค่า คือ",result)
}
sum(100,200,300)