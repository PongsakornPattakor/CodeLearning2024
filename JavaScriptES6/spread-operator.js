// Spread operator

const newArr = [100, 200, 300];
const data = [10, 20, ...newArr]; // กระจายสมาชิกมาเก็บใน data

console.log(data);

const berries = ["สตรอเบอรี่", "บลูเบอรี่", "ราสเบอรี่"];
const fruits = ["มะม่วง", "ส้มโอ", "แตงโม"];

fruits.push(...berries); // กระจายสมาชิก
console.log(fruits);
