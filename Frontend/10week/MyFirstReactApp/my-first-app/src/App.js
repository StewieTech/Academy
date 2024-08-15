import React from "react"
import { SumProvider } from "./component/SumContext/SumContext"
import { InputComponent } from "./component/InputComponent/InputComponent"
import DisplayComponent from "./component/DisplayComponent/DisplayComponent"
import BrowserRo

function App  ()  {
  return (
    <SumProvider>
      <h1> Sum Two Numbers</h1>
    <div>
    <InputComponent />
    <DisplayComponent />
    </div>
    </SumProvider>
  )
}

export default App
