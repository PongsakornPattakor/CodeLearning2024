let username: unknown;
username = "nobelix"; // แม้จะมีชนิดเป็น string แต่ TS ยังมองเป็น unknown

let username2: unknown;
username2 = "PrimeLord";
// ระบุชนิดข้อมูลด้วย as
console.log((username as string).toUpperCase());

// ระบุชนิดข้อมูลด้วย <>
console.log((<string>username2).toLowerCase());
