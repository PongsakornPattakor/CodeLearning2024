// Rest parameter

function summation(...numArr) {
  let total = 0;
  for (let items of numArr) {
    total += items;
  }
  return total;
}

console.log(summation(10, 20, 30, 40, 50));
