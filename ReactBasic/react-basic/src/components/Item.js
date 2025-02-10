import PropTypes from "prop-types";

const Item = (props) => {
  const { title, amount } = props;
  const status = amount < 0 ? "expenses" : "incomes";
  if (status === "incomes") {
    return (
      <li className="bg-white/70 rounded-md  shadow-lg p-[30px] my-2 flex justify-between">
        {title}
        <span className="text-green-500">+{amount}</span>
      </li>
    );
  } else {
    return (
      <li className="bg-white/70 rounded-md  shadow-lg p-[30px] my-2 flex justify-between">
        {title}
        <span className="text-red-500">-{Math.abs(amount)}</span>
      </li>
    );
  }
};
Item.propTypes = {
  title: PropTypes.string.isRequired,
  amount: PropTypes.number.isRequired,
};

export default Item;
