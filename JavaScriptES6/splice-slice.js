// Splice
const numb = [1, 2, 3, 4, 5, 6];
numb.splice(1, 3, 999); // splice(ตำแหน่งแรก,จำนวน,ค่าที่จะแทรกแทน)
console.log(numb);

// Slice
const data = [1, 3, 5, 7, 9, 11];
const lastData = data.slice(2, 5);
console.log(lastData); // slice(ตำแหน่งแรก,ตำแหน่งสุดท้าย+1)
