const colors = ["แดง", "เขียว", "ดำ", "น้ำตาล", "น้ำเงิน"];

// indexOf
const index = colors.indexOf("ดำ"); //
console.log(`ตำแหน่งของสีดำ คือ ${index}`);

// find
const result = colors.find((element) => element === "น้ำตาล"); // ถ้าไม่เจอ จะได้ค่า undefined
console.log(result);

// findIndex
const result2 = colors.findIndex((element) => element === "น้ำตาล"); // ถ้าไม่เจอ จะได้ค่า undefined
console.log(result2);
