import React, { useContext, useState } from 'react';
import SumContext from '../SumContext/SumContext';
import './InputComponent.css';



export const InputComponent = () => {
  const { calculateSum } = useContext(SumContext);
  const [num1, setNum1] = useState(0);
  const [num2, setNum2] = useState(0);

  const handleSubmit = (e) => {
    e.preventDefault();
    calculateSum(num1, num2);
  };

  return (
    <form onSubmit={handleSubmit}>
      <label>
        Number 1:
        <input type="number" onChange={(e) => setNum1(+e.target.value)} />
      </label>
      <label>
        Number 2:
        <input type="number" onChange={(e) => setNum2(+e.target.value)} />
      </label>
      <button type="submit">Add</button>
    </form>
  );
};