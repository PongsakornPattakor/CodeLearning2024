function formatNum(num: any) {
  return num.toFixed(2);
}

let weight: unknown = "70.527"; // สามารถแปลงข้อมูลเป็นชนิดอื่นได้
weight = 70.527;
if (typeof weight === "number") {
  console.log(formatNum(weight));
} else {
  console.log(`This variable is not a number`);
}
