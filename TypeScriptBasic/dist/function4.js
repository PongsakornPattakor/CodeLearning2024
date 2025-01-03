"use strict";
function checkNum(num) {
    if (num % 2 == 0) {
        return "เลขคู่";
    }
    else {
        return "เลขคี่";
    }
}
let num = 16;
console.log(`${num} : เป็น${checkNum(num)}`);
