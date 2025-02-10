import { useState, useEffect } from "react";
import { v4 as uuidv4 } from "uuid";
// import Report from "./Report";

const FormComponent = (props) => {
  const [title, setTitle] = useState("");
  const [amount, setAmount] = useState(0);
  const [formValid, setFormValid] = useState(false);

  const inputTitle = (event) => {
    setTitle(event.target.value); // เก็บค่าที่ถูกป้อนผ่านฟอร์ม
  };
  const inputAmount = (event) => {
    setAmount(event.target.value);
  };
  const saveItem = (event) => {
    event.preventDefault(); // ให้คงที่คำสั่งเอาไว้ใน console
    const itemData = {
      // เมื่อเก็บลงใน state แล้ว เอามาสร้างเป็น object
      id: uuidv4(),
      title: title,
      amount: Number(amount),
    };
    props.onAddItem(itemData); // ส่งข้อมูลไปยัง App component (ลูก -> แม่)
    setTitle("");
    setAmount(0);
  };

  useEffect(() => {
    if (amount !== 0 && title.trim().length > 0) {
      setFormValid(true);
    }
    console.log("Call useEffect"); // แสดงข้อความนี้ทุกครั้งเมื่อ state มีการเปลี่ยนแปลง
  }, [amount]); // ดักจับการเปลี่ยนแปลงเฉพาะตัวแปรที่เลือก

  return (
    <div className="grid place-items-center justify-self-center">
      <form
        className="flex flex-col bg-white/40 backdrop-blur-md p-3 m-2 rounded-md shadow-lg md:w-[50vw]"
        onSubmit={saveItem}
      >
        <div className="my-2">
          <label className="my-8 mx-2 text-xl">ระบุรายการ</label>
          <input
            className="rounded-md p-1 my-2 text-center w-full"
            type="text"
            placeholder="ระบุชื่อรายการ"
            onChange={inputTitle}
            value={title}
          />
        </div>
        <div className="my-2">
          <label className="my-8 mx-2 text-xl">ระบุจำนวนเงิน</label>
          <input
            className="rounded-md p-1 my-2 text-end w-full"
            type="number"
            placeholder="+ รายรับ , - รายจ่าย"
            onChange={inputAmount}
            value={amount}
          />
        </div>
        <div className="grid place-items-center">
          <button
            className=" bg-white rounded-md hover:text-white hover:bg-black p-2 m-2 w-full"
            type="submit"
            disabled={!formValid}
          >
            เพิ่มข้อมูล
          </button>
        </div>
      </form>
    </div>
  );
};

export default FormComponent;
