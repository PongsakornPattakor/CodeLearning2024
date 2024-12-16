const a = document.getElementById("title"); //ในไฟล์ HTML ต้องให้หาตัว id ให้เจอก่อน แล้วจึงนำคำสั่งใน .js มาทำงาน
const b = document.getElementsByTagName("p");
const c = document.querySelector(".my-js"); //อ้างอิงผ่าน class


console.log(a);
console.log(b);

let x = 10;
let y = 20;

//เมื่อมีการกดปุ่ม จะสั่งให้ทำคำสั่งนี้ นั่นคือเปลี่ยนข้อความในแท็ก p ที่มี id = demo
function displayText(){
    a.innerHTML = `<strong>แสดงตัวแปร x คือ = ${x} และ y คือ = ${y}</strong>`;//สามารถแสดงผล tag ของ HTML ได้
    //สามารถแสดงค่าตัวแปร โดยใช้ ` และ ${} ได้ โดยไม่ต้องเขียน +
}