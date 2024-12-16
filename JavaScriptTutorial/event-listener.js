//อ้างอิง
const menu = document.getElementById("menu");
const display = document.getElementById("display");
const btn = document.getElementById("btn");

//event
menu.addEventListener("change", getMenu);
btn.addEventListener("click", success);

function getMenu() {
  display.innerText = menu.value;
}

function success() {
  alert("คำสั่งซื้อสำเร็จแล้ว");
}
