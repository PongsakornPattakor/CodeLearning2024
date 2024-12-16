// ฟังก์ชั่นที่มีการรับค่าและส่งค่า
function setSalary(money){
    let bonus = 1.5*money;
    let salary = bonus+money;
    return salary;
}

let a = setSalary(15000);
console.log("เงินสุทธิที่จะได้รับในปีนี้คือ",a);

let b = setSalary(12000);
console.log("เงินสุทธิที่จะได้รับในปีนี้คือ",b);
