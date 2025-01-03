const person3: { name: string; age: number } = {
  name: "Aoey",
  age: 25,
};

const showDetail = (data: { name: string; age: Number }) => {
  console.log(`ชื่อ : ${data.name} อายุ : ${data.age}`);
};

showDetail(person3);
