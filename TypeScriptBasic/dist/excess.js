"use strict";
function showInfo(data) {
    console.log(`ชื่อ = ${data.name} อายุ = ${data.age}`);
}
const human = {
    name: "Noman",
    age: 0,
    address: "Phuket", // จริงๆฟังก์ชั่นไม่มีการทำงานกับ property นี้
};
// คือการโยนทั้ง object มาในฟังก์ชั่น เพื่อตรวจสอบว่าฟังก์ชั่นสามารถทำงานกับทุก properties ของ object ได้ไหม
showInfo({
    name: "Noman",
    age: 0,
});
