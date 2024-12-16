function welcome() {
  alert("ยินดีต้อนรับสู่หน้าเว็บ");
}

function highlight(obj) {
  obj.style.background = "yellow";
}

function unhighlight(obj) {
  obj.style.background = "white";
}

function getMenu() {
  const menu = document.getElementById("menu");
  const display = document.getElementById("display");
  console.log(menu.value);
  display.innerText = menu.value; //เปลี่ยนข้อความใน p
}
