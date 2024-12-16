let product = {
    name: "เมาส์",
    price: 1500,
    brand: "logitech",
    category: "gadget"
};
console.log("ชื่อสินค้า",product.name);
console.log("ราคา",product.price);

let user = {
    name: "First",
    age: 26,
    email: "pattakor.f@gmail.com",
    displayUser: function (){ //สามารถระบุ function ได้
        return "ชื่อ "+this.name+" อายุ "+this.age;
    },
    birthYear: function (){
        return " เกิดปี "+ (2024-this.age);
    }
};

console.log(user.displayUser());
console.log(user.birthYear());
document.write(user.displayUser());
document.write(user.birthYear());