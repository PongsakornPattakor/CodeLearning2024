"use strict";
const usersArr = ["แนน", "ดรีม", "เอย"];
usersArr.push("เบน", "บอย");
console.log(usersArr);
// for looop
for (let i = 0; i < usersArr.length; i++) {
    console.log(`สมาชิกคนที่ ${i + 1} : ${usersArr[i]}`);
}
// forEach
usersArr.forEach((e) => {
    console.log(e);
});
