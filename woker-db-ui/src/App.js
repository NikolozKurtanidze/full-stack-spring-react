import React from "react";
import UserTable from './components/UserTableComponent';
import NewUserForm from "./components/NewUserForm";
import UserService from "./services/UserService";

function App() {
  console.log("123");
  return (
    <div className="App">
      <UserTable />
      <NewUserForm />
    </div >
  );
}

export default App;
