import React, { useState } from "react";
import UserService from "../services/UserService";

class NewUserForm extends React.Component {

  constructor(props) {
    super(props);
  }

  render() {
    return (
      <div>
        <table>
          <tr>
            <input placeholder="Name" id="nameInput"></input>
          </tr>
          <tr>
            <input placeholder="Position" id="posInput"></input>
          </tr>
          <tr>
            <button onClick={() => UserService.postUser(document.getElementById("nameInput").value, document.getElementById("posInput").value)}>
              Add worker
            </button>
          </tr>
        </table>
      </div >
    )
  }
}


export default NewUserForm;