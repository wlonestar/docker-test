import axios from 'axios'

const request = axios.create({
  baseURL: 'http://106.14.24.103:8080',
  timeout: 5000
})

export default request
