const box = document.getElementById("box");
let status;

function addDarkMode() {
  box.classList.add("darkMode"); //เพิ่ม class
}

function delDarkMode() {
  box.classList.remove("darkMode"); //ลบ class
}

function switchMode() {
  box.classList.toggle("darkMode"); //เพิ่มสลับกับลบ class ในปุ่มเดียว
  status = box.classList.contains("darkMode"); //เช็คว่ามี class นี้อยู่มั้ย
  if (status) {
    box.style.color = "white"; //ถ้ามี เปลี่ยข้อความเป็นสีขาว
  } else {
    box.style.color = "red"; //ถ้าไม่มี เปลี่ยนข้อความเป็นสีแดง
  }
}
