import axios from "axios";

const usersURL = 'http://localhost:8080/workers';


class UserService {
  getUsers() {
    return axios.get(usersURL, {
      auth: {
        username: '[API_USERNAME]',
        password: '[API_PASSWORD]'
      }
    });
  }

  deleteUser(id) {
    axios.delete((usersURL + "/" + id), {
      auth: {
        username: '[API_USERNAME]',
        password: '[API_PASSWORD]'
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
        username: '[API_USERNAME]',
        password: '[API_PASSWORD]'
      }
    });
  }
}

export default new UserService();
