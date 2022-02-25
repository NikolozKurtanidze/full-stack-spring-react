import React from "react";
import UserService from "../services/UserService";

class UserTable extends React.Component {

  constructor(props) {
    super(props);
    this.state = {
      users: []
    }
  }

  componentDidMount() {
    UserService.getUsers().then((response) => {
      this.setState({ users: response.data });
    }
    );
  }

  render() {
    return (
      <div>
        <table>
          <thead>
            <td>Id</td>
            <td>Name</td>
            <td>Position</td>
          </thead>
          <tbody>
            {
              this.state.users.map(user =>
                <tr key={user.id}>
                  <td>{user.id}</td>
                  <td>{user.name}</td>
                  <td>{user.position}</td>
                  <td><button onClick={() => UserService.deleteUser(user.id)}>Delete User</button></td>
                </tr>)
            }
          </tbody>
        </table>
      </div>

    )
  }

}

export default UserTable;
