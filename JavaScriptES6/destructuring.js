// Destructuring array
const colors = ["เขียว", "แดง", "เหลือง", "น้ำเงิน"];
const [green, red, yellow, blue] = colors;

console.log(red);

// Destructuring object
const product = {
  productName: "Mainboard",
  brand: "ROG",
  price: 16500,
  stock: 20,
};

const { productName: pName, brand: br, p: price } = product;
console.log(pName);
console.log(br);
