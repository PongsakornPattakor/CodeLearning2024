const sum = (...numbers: number[]) => {
  return numbers.reduce((result, value) => {
    return result + value;
  }, 0);
};

console.log(sum(10, 20, 30));
console.log(sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
