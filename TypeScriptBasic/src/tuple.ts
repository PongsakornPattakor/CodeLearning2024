type HttpCode = [code: number, status: string];

const httpOK: HttpCode = [200, "OK"]; // สามารถสร้าง type ใหม่มาแทนได้
const httpBadReq: [number, string] = [400, "คำขอไม่ถูกต้อง"];
const httpNotFound: [code: number, status: string] = [404, "ไม่พบข้อมูล"]; // ใส่ tuple label ช่วยให้อ่านง่ายขึ้น

console.log(httpNotFound);
