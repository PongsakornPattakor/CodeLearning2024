// Async & Await

const connect = true;

const url1 = "1.js";
const url2 = "2.js";
const url3 = "3.js";
const url4 = "4.js";
const url5 = "5.js";

function downloading(url) {
  return new Promise(function (resolve, reject) {
    console.log(`กำลังดาวน์โหลดไฟล์ : ${url}`);
    setTimeout(() => {
      if (connect) {
        resolve(`โหลดไฟล์ ${url} สำเร็จ`);
      } else {
        reject(`เกิดข้อผิดพลาดขึ้นขณะดาวน์โหลด`);
      }
    }, 3000);
  });
}

async function start() {
  console.log(await downloading(url1)); // ดาวน์โหลดไฟล์ในบรรทัดนี้ให้เสร็จก่อน แล้วค่อยทำงานบรรทัดถัดไป
  console.log(await downloading(url2));
}

start();

/*  ประยุกต์ใช้กับ api ภาพสินค้า (backend) เอามาใช้งานฝั่ง frontend (แสดงภาพหน้าเว็บ)
    api(promises) -> (pending) -> รอข้อมูลมาครบ (await) -> แสดงภาพ */
