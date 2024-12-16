// โปรแกรมดาวน์โหลด ไฟล์

const url1 = "Web.html";
const url2 = "Dec.css";
const url3 = "Func.js";

function downloading(url, status) {
  console.log(`กำลังดาวน์โหลด : ${url}`);
  setTimeout(() => {
    status(url);
  }, 2000);
}

downloading(url1, function complete(result) {
  console.log(`ดาวน์โหลด ${result} เสร็จสิ้น`);
  downloading(url2, function complete(result) {
    console.log(`ดาวน์โหลด ${result} เสร็จสิ้น`);
    downloading(url3, function complete(result) {
      console.log(`ดาวน์โหลด ${result} เสร็จสิ้น`);
      // เขียนซ้อนกันไปเรื่อยๆจะเกิด callback hell
    });
  });
});
