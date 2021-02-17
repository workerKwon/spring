import axios from 'axios';

const request = function request() {
  const instance = axios.create({
    baseURL: 'http://localhost:8083/_api',
  });

  return instance;
};

export default request();
