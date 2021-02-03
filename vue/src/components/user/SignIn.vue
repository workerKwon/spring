<template lang="pug">
#sign-in
  .input-box
    span email
    input(type="text" v-model="user.email")
  .input-box
    span password
    input(type="password" v-model="user.password")
  .input-box
    button(@click="onClickSignIn") Sign In
  .input-box
    button(@click="goToSignUp") signUp

</template>

<script>
import {mapActions} from 'vuex'
export default {
  name: "SignIn",
  data() {
    return {
      user: {
        email: '',
        password: '',
      }
    }
  },
  methods: {
    ...mapActions([
      'signIn'
    ]),
    goToSignUp() {
      this.$router.push("/signUp")
    },
    onClickSignIn(event) {
      event.target.blur()
      const form = new FormData() // form에 담아서 보내주면 자동으로 CSRF 토큰이 생성되어 첨부된다.
      form.append('email', this.user.email)
      form.append('password', this.user.password)
      this.signIn(form);
    }
  }
}
</script>

<style scoped>

</style>
