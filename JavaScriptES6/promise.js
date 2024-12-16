// Promises

const connect = true; // เช็คว่าต่อเน็ตมั้ย
const url1 = "1.com";
const url2 = "2.com";
const url3 = "3.com";
const url4 = "4.com";
const url5 = "5.com";

function downloading(url) {
  return new Promise(function (resolve, reject) {
    console.log(`กำลังโหลดไฟล์จาก ${url}`);
    setTimeout(() => {
      if (connect) {
        resolve(`โหลด ${url} สำเร็จ`);
      } else {
        reject(`เกิดข้อผิดพลาดการดาวน์โหลด`);
      }
    }, 1000);
  });
}

downloading(url1)
  .then(function (result) {
    console.log(result); // ถ้าทำงานสำเร็จใน Promises จะให้ทำงานอะไร
    return downloading(url2);
  })
  .then(function (result) {
    console.log(result);
    return downloading(url3);
  })
  .catch((error) => {
    console.log(error); // ถ้าทำงานผิดพลาดใน Promises จะให้ทำงานอะไร
  })
  .finally(() => console.log("สิ้นสุดการทำงาน")); // ไม่ว่าการทำงานใน Promises จะเป็นสถานะไหน ก็ให้ทำงานส่วนนี้อยู่ดี
