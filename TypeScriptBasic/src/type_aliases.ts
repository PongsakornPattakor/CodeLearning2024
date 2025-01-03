// คล้ายๆการสร้างชนิดข้อมูลขึ้นมาใหม่
type Employee = {
  id: number;
  name: string;
  readonly age: number; // เมื่อกำหนดค่าแล้ว จะไม่สามารถแก้ไขปรับค่าใหม่ได้
  salary: number;
  address?: string; // Type aliases แบบ Optional
};

let emp1: Employee = {
  // Type aliases แบบปกติ ถ้าใส่ properties ไม่ครบ จะแจ้ง error
  id: 1,
  name: "Goku",
  age: 70,
  salary: 15000,
  address: "Na-Max",
};

let emp2: Employee = {
  // Type aliases แบบ Optional สามารถใส่หรือไม่ใส่ properties ที่มีเครื่องหมาย ?: ก็ได้
  id: 2,
  name: "Vegeta",
  age: 75,
  salary: 3000,
};

emp1.address = "Earth";

console.log(emp1);
console.log(emp2);
