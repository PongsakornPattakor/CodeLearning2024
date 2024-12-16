let colors = ["แดง","ขาว","ฟ้า","เหลือง","ม่วง","น้ำตาล","เขียว"];

//แปลงเป็น String แบบปกติ
let x = colors.toString();

//แปลงเป็น String โดยเปลี่ยนเครื่องหมายที่คั่น
let y = colors.join("-");

//เอาตัวสุดท้ายออกมาเก็บค่าไว้
let pop = colors.pop();

console.log(x);
console.log(y);
console.log(pop);