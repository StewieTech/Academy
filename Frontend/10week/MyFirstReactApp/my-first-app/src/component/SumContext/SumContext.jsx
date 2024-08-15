import React, { createContext, useState } from 'react';
import './SumContext.css';

export const SumContext = createContext(); 

export const SumProvider = ({ children }) => {
    const [sum, setSum] = useState(0);
    
    const calculateSum = (a,b) => {
        setSum(a + b) ;
    };
    
    
    return (
        <SumContext.Provider value={{ sum, calculateSum }}>
            {children}
        </SumContext.Provider>
    );
}
    
export default SumContext;