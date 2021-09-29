import request from '../utils/request'

// 查询所有文章
export function getAllUser () {
  return request({
    url: '/user',
    method: 'get'
  })
}
