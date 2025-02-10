import { useContext } from "react";
import DataContext from "../DataContext";

const Report = () => {
  const { income, expense, net } = useContext(DataContext); // ใช้ context แต่ต้อง destructuring ก่อน
  const formatNum = (number) => {
    return number.toString().replace(/(\d)(?=(\d{3})+(?!\d))/g, "$1,");
  };

  return (
    <div className="grid place-items-center justify-self-center">
      <div className="bg-white/40 backdrop-blur-md p-2 rounded-md md:w-[50vw]">
        <h3>ยอดคงเหลือ (บาท) :</h3>
        <h1 className="text-3xl text-center">฿&nbsp;{formatNum(net)}</h1>
        <div className="grid grid-cols-2 ring-1 ring-white rounded-md divide-x-2 my-2">
          <div className="p-3">
            <h3>รายรับ :</h3>
            <h1 className="text-2xl text-center">฿&nbsp;{formatNum(income)}</h1>
          </div>
          <div className="p-3 border-r-4 border-r-red-500">
            <h3>รายจ่าย :</h3>
            <h1 className="text-2xl text-center">
              ฿&nbsp;{formatNum(expense)}
            </h1>
          </div>
        </div>
        {/* <h1 className="text-3xl text-center">สวัสดี : {name}</h1>; */}
      </div>
    </div>
  );
};

export default Report;
