import FormComponent from "./components/FormComponent";
import Transaction from "./components/Transaction";
import Report from "./components/Report";
import { useState, useEffect } from "react";
import DataContext from "./DataContext";
import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";

const App = () => {
  const initData = []; // ย้ายมาจาก Transaction เพื่อใช้ useState แล้วกระจาย Props

  // const initStae = [
  //   { id: 1, title: "เงินเดือน", amount: 32000 },
  //   { id: 2, title: "ค่าขนม", amount: -700 },
  //   { id: 3, title: "โบนัส", amount: 3000 },
  // ];

  const [items, setItems] = useState(initData); // สร้าง array

  const [reportIncome, setReportIncome] = useState(0);
  const [reportExpense, setReportExpense] = useState(0);

  const onAddNewItem = (newItem) => {
    setItems((prevItem) => {
      return [newItem, ...prevItem]; // เอา array ก้อนใหม่มาต่อด้านหน้าก้อนเก่า
    });
  };

  useEffect(() => {
    const amounts = items.map((items) => items.amount); // array amount
    const income = amounts
      .filter((e) => e > 0)
      .reduce((total, e) => (total += e), 0)
      .toFixed(2);
    const expense = (
      amounts.filter((e) => e < 0).reduce((total, e) => (total += e), 0) * -1
    ).toFixed(2);
    console.log(income);
    console.log(expense);

    setReportIncome(income);
    setReportExpense(expense);
  }, [items, reportIncome, reportExpense]);

  const InsertLayout = () => {
    return (
      <>
        <FormComponent onAddItem={onAddNewItem} />
        <Transaction items={items} />
      </>
    );
  };

  return (
    // ข้อมูลกลาง ที่จะกระจายไปยัง component
    <DataContext.Provider
      value={{
        income: reportIncome, // เอาค่าที่อยู่ใน state มาใส่
        expense: reportExpense, // เอาค่าที่อยู่ใน state มาใส่
        net: (reportIncome - reportExpense).toFixed(2),
      }}
    >
      <main className="flex flex-col">
        <h1 className="text-3xl text-center my-5 font-semibold">
          แอพคำนวณรายรับ-รายจ่าย
        </h1>
        <p className="text-xl text-center my-5">บันทึกข้อมูลบัญชีในแต่ละวัน</p>
        <Router>
          <div className="text-center justify-items-center">
            <ul className="flex gap-3 my-3">
              <li className="p-2 rounded-md bg-white">
                <Link to="/">ข้อมูลบัญชี</Link>
              </li>
              <li className="p-2 rounded-md bg-white">
                <Link to="/insert">บันทึกข้อมูล</Link>
              </li>
            </ul>
            <Routes>
              <Route path="/" exact element={<Report />}></Route>
              <Route path="/insert" element={<InsertLayout />}></Route>
            </Routes>
          </div>
        </Router>
      </main>
    </DataContext.Provider>
  );
};

export default App;
