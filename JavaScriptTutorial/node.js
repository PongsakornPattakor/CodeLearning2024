const menu = document.getElementById("menu");
const category = document.getElementById("category");

let count = 1;

//การเพิ่ม Node
function addItem(){
    const item = document.createElement("li");// สร้าง element ใหม่
    item.innerText= "รายการ "+ (count++); 
    menu.appendChild(item); // เอา element ไปต่อ
}

//การลบ Node
function deleteItem(){
    const france = document.getElementById("region-3");
    category.removeChild(france); // ลบ element ออก
}

//การแทนที่ Node
function replaceItem(){
    const item2 = document.getElementById("region-2");
    
    const newItem = document.createElement("li");
    newItem.innerText = "Italian";
    
    category.replaceChild(newItem,item2); // แทนที่ element
}
