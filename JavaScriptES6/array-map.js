// Array map
const numbs = [10, 20, 30, 40, 50];

const result = numbs.map((element) => {
  const a = element * 2;
  return a;
});
console.log(result);

const climate = ["ฝนตก", "แดดร้อน", "พายุ", "แจ่มใส", "หมอกหนา"];

const weather = climate.map((e, i) => {
  // e = สมาชิกแต่ละตัว , i = เลข index
  return `วันที่ ${i + 1} จะมีสภาพอากาศ ${e}`;
});
console.log(weather);

const data = [
  { day: "24/09/2567", weather: "แดดออก", temp: 26 },
  { day: "25/09/2567", weather: "ฝนตก", temp: 24 },
  { day: "26/09/2567", weather: "หมอกหนา", temp: 18 },
];

const climateTH = data.map((e) => {
  return e.weather;
});
console.log(climateTH);
