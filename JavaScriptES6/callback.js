function plus(x, y, callback) {
  console.log(`กำลังคำนวณ.. ผลบวกของ ${x} กับ ${y}`);
  setTimeout(() => {
    const sum = x + y;
    callback(sum);
  }, 2000);
}

// ฟังก์ชั่นแบบ callback
plus(100, 200, function display(result) {
  console.log(`ผลการคำนวณ คือ ${result}`);
}); // ทำงานฟังก์ขั่น plus ก่อน แล้วจึงไปทำงานฟังก์ชั่น display
