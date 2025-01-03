type Members = {
  name: string;
  salary: number;
  department: string;
};

const party: Members[] = [];
party.push({ name: "Max", salary: 15000, department: "Bank" });
party.push({ name: "Boy", salary: 35000, department: "Front end dev" });
party.push({ name: "Thep", salary: 39000, department: "BA" });

for (let e of party) {
  console.log(e);
}
