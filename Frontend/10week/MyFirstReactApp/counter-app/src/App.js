import React from "react";
import { useSelector, useDispatch } from "react-redux";
import { decrement, increment, reset } from "./redux/slice";

const styles = {
  margin: "2px",
};

const App = () => {
  const count = useSelector((state) => state.counter.value);
  const dispatch = useDispatch();

  return (
    <div>
      <h1> Counter : {count}</h1>
      <button style={styles} onClick={() => dispatch(increment())}>
        Increase Counter
      </button>
      <button style={styles} onClick={() => dispatch(decrement())}>
        Decrease Counter
      </button>
      <button style={styles} onClick={() => dispatch(reset())}>
        Reset Counter
      </button>
    </div>
  );
};

export default App;