function sayHi(): string;
function sayHi(msg: string): string;
function sayHi(msg?: unknown): unknown {
  // ใช้เพื่อระบุว่า จะใส่หรือไม่ใส่ parameter ก็ได้
  if (!msg) {
    return "Hello TS";
  }
  if (typeof msg == "string") {
    return `Hello ${msg}`;
  }
  throw new Error("ชนิดข้อมูลไม่ถูกต้อง");
}
console.log(sayHi("Nobelix"));

function total(a: number, b: number): number;
function total(a: string, b: string): string;
function total(a: unknown, b: unknown): unknown {
  if (typeof a == "number" && typeof b == "number") {
    return a + b;
  }
  if (typeof a == "string" && typeof b == "string") {
    return parseInt(a) + parseInt(b);
  }
  throw new Error("ชนิดข้อมูลไม่ถูกต้อง");
}

console.log(typeof total("100", "200"));
