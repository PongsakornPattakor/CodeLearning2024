let money = 500;
let price = 30.5;
let message = "Potato ship";
let check = false;

console.log(message,"ราคา",price);
console.log(typeof(check)); //เช็คประเภทข้อมูล

let age = "20.15"; 
age = parseFloat(age); //แปลง String เป็น Number
console.log("หลังแปลงตัวแปรแล้วจะได้เป็น",typeof(age));

price = ""+price; //แปลง Number เป็น String
console.log("หลังแปลงตัวแปรแล้วจะได้เป็น",typeof(price));