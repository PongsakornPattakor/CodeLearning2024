// Array reduce

const data = [10, 20, 30, 40, 50];

const redData = data.reduce((value, e) => {
  const total = e + value; // เอา element แต่ละตัวบวกกับ value แล้วกำหนดเป็น total ซื่งจะถูกสะสมเป็น value
  return total; // เมื่อประมวลผลจนครบแล้ว จะส่งค่าออกมาเป็น value
}, 0);

console.log(redData);

const cart = [
  { name: "กระเป๋า", price: 1200, stock: 5 },
  { name: "หนังสือ", price: 500, stock: 15 },
  { name: "เครื่องเขียน", price: 3400, stock: 8 },
];

const sumCart = cart.reduce((value, e) => {
  const total = e.price + value;
  return total;
}, 0);
console.log(sumCart);
