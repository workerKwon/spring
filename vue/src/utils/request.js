import axios from "axios";

let request = function request() {
  let instance = axios.create({
    baseURL: 'http://localhost:8080/_api',
  })

  return instance
}

export default request()
