"use strict";
const httpOK = [200, "OK"]; // สามารถสร้าง type ใหม่มาแทนได้
const httpBadReq = [400, "คำขอไม่ถูกต้อง"];
const httpNotFound = [404, "ไม่พบข้อมูล"]; // ใส่ tuple label ช่วยให้อ่านง่ายขึ้น
console.log(httpNotFound);
