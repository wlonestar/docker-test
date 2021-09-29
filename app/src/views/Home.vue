<template>
  <div>
    <div v-for="user in users" :key="user" style="margin: 20px 20px 20px 20px;">
      <p>{{ user.id }}</p>
      <p>{{ user.username }}</p>
      <p>{{ user.password }}</p>
      <p>{{ user.age }}</p>
      <p v-if="user.gendar === true">男</p>
      <p v-if="user.gendar === false">女</p>
      <p>{{ user.address }}</p>
    </div>
  </div>
</template>

<script>
import { getAllUser } from '../api/user'
export default {
  name: 'Home',
  data () {
    return {
      users: [
        {
          id: 0,
          username: '',
          password: '',
          age: 0,
          gendar: true,
          address: ''
        }
      ]
    }
  },
  created () {
    this.load()
  },
  methods: {
    load () {
      getAllUser().then(data => {
        this.users = data.data.data
      })
    }
  }
}
</script>
