// ดึงข้อมูลจาก api มาแสดงผล
const list = document.getElementById("list");
let output = "";

async function getData() {
  const url = "https://jsonplaceholder.typicode.com/users";
  const res = await fetch(url);
  const json = await res.json();
  json.forEach((element) => {
    output += "<li>" + element.name + "</li>";
  });
  list.innerHTML = output;
}
getData();
