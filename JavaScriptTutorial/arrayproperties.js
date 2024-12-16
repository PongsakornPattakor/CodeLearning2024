let colors = ["แดง","ขาว","เหลือง","เขียว","ฟ้า"];

let count = colors.length;
console.log("จำนวนสมาชิกคือ",count);

//เพิ่มสมาชิกลงไปใน array
colors.push("ดำ");

//เรียงลำดับ พยัญชนะขึ้นก่อน
let result = colors.sort();
console.log("เรียงแบบพยัญชนะขึ้นก่อน คือ",result);

//เรียงลำดับ สระขึ้นก่อน
let reverse = colors.reverse();
console.log("เรียงแบบสระขึ้นก่อน คือ",reverse);
