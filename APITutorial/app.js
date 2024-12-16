// JavaScript Object
let userJS = {
  name: "first",
  age: 26,
  phone: null,
};

// JSON String
let userJSON = `{
    "name": "first",
    "age": 26,
    "phone": null
  }`;

// JSON.parse() : เปลี่ยนจาก json string -> js object
let myObj = JSON.parse(userJSON);

console.log(userJSON);
console.log(myObj);

// JSON.stringify() : เปลี่ยนจาก js object -> json string
let myJSON = JSON.stringify(userJS);

console.log(userJS);
console.log(myJSON);

// ดึงข้อมูลจากไฟล์ user.json ไปแสดงผล
let output = "";
const list = document.getElementById("list");

// Promise
// fetch("users.json")
//   .then((res) => res.json())
//   .then((json) => {
//     json.users.array.forEach((item) => {
//       output += "<li>" + item.name + "</li>";
//     });
//     list.innerHTML = output;
//   })
//   .catch((err) => {
//     console.log(err);
//   });

// Async & Await
async function getUser() {
  const response = await fetch("users.json");
  const usersJSON = await response.json();
  console.log(typeof usersJSON);
  usersJSON.users.forEach((element) => {
    output += "<li>" + element.name + "</li>";
  });
  list.innerHTML = output;
}
getUser();
