// Loop array
const data = [10, 20, 30, 40];

// For loop
for (let i = 0; i < data.length; i++) {
  if (data[i] >= 30) break;
  console.log(`ข้อมูลลำดับที่ ${i + 1} คือ ${data[i]}`);
}

// For each ไม่สามารถใช้ break , continue ได้ แต่ยังใช้ if ได้
const year = [1997, 1998, 1999, 2000];
year.forEach((element) => {
  // loop element แต่ละตัว
  console.log("การ loop ด้วย ForEach " + element);
});

// For of
const age = [14, 17, 21, 26];
for (const numb of age) {
  console.log(`สมาชิกของ age คือ ${numb}`);
}
