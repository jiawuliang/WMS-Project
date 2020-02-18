<template>
  <div>
    用户名:<input type="text" v-model="loginForm.username" placeholder="请输入用户名"/>
    <br><br>
    密码： <input type="password" v-model="loginForm.password" placeholder="请输入密码"/>
    <br><br>

    <a-button type="primary" @click="login">登录</a-button>

  </div>
</template>

<script>
  export default {
    name: 'Login',
    data() {
      return {
        loginForm: {
          username: '',
          password: ''
        },
        responseResult: []
      }
    },
    methods: {
      login() {
        let self = this;
        this.$http
          .post('/login')
          .then(result => {
            self.$router.push({path: '/index'})
          })
          .catch(error => {
          })
      }
    }
  }
</script>

<style scoped>

</style>
