let inputNum = 0;
let service: string;

switch (inputNum) {
  case 1:
    service = "สอบถามยอดเงินคงเหลือ";
    break;
  case 2:
    service = "ฝากเงิน";
    break;
  case 3:
    service = "ถอนเงิน";
    break;

  default:
    service = "หมายเลขบริการไม่ถูกต้อง";
    break;
}
console.log(service);
