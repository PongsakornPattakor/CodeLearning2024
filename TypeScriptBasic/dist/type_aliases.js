"use strict";
let emp1 = {
    // Type aliases แบบปกติ ถ้าใส่ properties ไม่ครบ จะแจ้ง error
    id: 1,
    name: "Goku",
    age: 70,
    salary: 15000,
    address: "Na-Max",
};
let emp2 = {
    // Type aliases แบบ Optional สามารถใส่หรือไม่ใส่ properties ที่มีเครื่องหมาย ?: ก็ได้
    id: 2,
    name: "Vegeta",
    age: 75,
    salary: 3000,
};
emp1.address = "Earth";
console.log(emp1);
console.log(emp2);
