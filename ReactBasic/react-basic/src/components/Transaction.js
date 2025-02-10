import Item from "./Item";
// import { useContext } from "react";
// import DataContext from "../DataContext";

const Transaction = (props) => {
  const { items } = props; // รับค่ามาจาก App component
  // const name = useContext(DataContext); // การใช้แทนวิธี Consumer
  return (
    <div>
      <ul className="text-center flex flex-col w-[50vw] justify-self-center">
        {items.map((e) => {
          // Loop ค่าจาก App
          return <Item title={e.title} amount={e.amount} key={e.id} />;
        })}
      </ul>
      {/* <DataContext.Consumer>{(value) => <p>{value}</p>}</DataContext.Consumer> */}
      {/* <p>{name}</p> */}
    </div>
  );
};
export default Transaction;
