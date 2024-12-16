// Array filter
const data = [10, 20, 30, 40, 50];

const result = data.filter((e) => {
  return e > 20; // กรองเฉพาะสมาชิกที่มากกว่า 20 เท่านั้น แล้วเก็บลงในตัวแปรใหม่
});
console.log(result);

const employee = [
  { name: "First", salary: 18000, department: "microbiologist" },
  { name: "Boy", salary: 35000, department: "programmer" },
  { name: "Yomost", salary: 15000, department: "teacher" },
  { name: "Bank", salary: 28000, department: "pharmacist" },
];

const highCost = employee
  .filter((e) => e.salary > 20000) // กรองว่าใครได้เงินมากกว่า 2000 แล้วเก็บเป็น array ใหม่
  .filter((e) => e.department === "programmer"); // นำ array ที่กรองเงินแล้ว มาทำการกรองตำแหน่ง แล้วเก็บเป็น array ใหม่อีกที
console.log(highCost);
