//เข้าถึงแบบ for loop
let colors = ["แดง","เขียว","เหลือง","ดำ","ม่วง"];

for(let i=0 ; i<colors.length ; i++){
    console.log("สมาชิกตัวที่",(i+1),"คือ",colors[i]);
}

//เข้าถึงแบบ for each
let fruits = ["มะม่วง","ทุเรียน","มังคุด","ส้ม"];

function myData(fruit){
    console.log("ผลไม้",fruit);
}

fruits.forEach(myData);