// Default parameter

getDataCustomer = (fname, lname, age, address = "ภูเก็ต") => {
  // ภูเก็ต เป็น default parameter
  const info = `ชื่อลูกค้า : ${fname}
    นามสกุลลูกค้า : ${lname}
    อายุ : ${age}
    ที่อยู่ : ${address}`;
  return info;
};

console.log(getDataCustomer("พงศกร", "พัฒกอ", 26, "หาดใหญ่"));
console.log(getDataCustomer("นวพรรษ", "เทพปุ๋ย", 25)); // ไม่ได้ระบุ address ทำให้ใช้ default parameter
