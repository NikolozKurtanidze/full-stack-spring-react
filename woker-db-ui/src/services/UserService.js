import axios from "axios";

const usersURL = 'http://localhost:8080/workers';


class UserService {
  getUsers() {
    return axios.get(usersURL, {
      auth: {
        username: 'restUser',
        password: 'restPassword'
      }
    });
  }

  deleteUser(id) {
    axios.delete((usersURL + "/" + id), {
      auth: {
        username: 'restUser',
        password: 'restPassword'
      }
    });
  }

  postUser(nameParam, positionParam) {
    const body = {
      name: nameParam,
      position: positionParam
    }
    axios.post((usersURL), body, {
      auth: {
        username: 'restUser',
        password: 'restPassword'
      }
    });
  }
}

export default new UserService();