import React, { useContext } from 'react';
import './DisplayComponent.css';
import SumContext from '../SumContext/SumContext';

export const DisplayComponent = () => {
    const { sum } = useContext(SumContext);
    return (
        <div className="DisplayComponent">
        <h2>Sum: {sum}</h2>
        </div>
    );
};

export default DisplayComponent;