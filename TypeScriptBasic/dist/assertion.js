"use strict";
let username;
username = "nobelix"; // แม้จะมีชนิดเป็น string แต่ TS ยังมองเป็น unknown
let username2;
username2 = "PrimeLord";
// ระบุชนิดข้อมูลด้วย as
console.log(username.toUpperCase());
// ระบุชนิดข้อมูลด้วย <>
console.log(username2.toLowerCase());
