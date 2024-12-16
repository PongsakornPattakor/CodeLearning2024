//การอ้างอิง
const title = document.getElementById("title");
const content = document.querySelector(".content");
const allP = document.querySelectorAll("p");
const box = document.querySelector(".light");

//การใช้ฟังก์ชั่น
function displayText(){
    title.style.color = "red";
    title.style.backgroundColor = "yellow";
    content.style.fontSize = "1.5rem";
    content.setAttribute("class","first");
}

function darkMode(){
    box.setAttribute("class","dark")
}

function lightMode(){
    box.setAttribute("class","light")
}