<template lang="pug">
#hello
  .input-box
    p name
    input(type="text" v-model="user.name")
  .input-box
    p email
    input(type="text" v-model="user.email")
  .input-box
    p password
    input(type="password" v-model="user.password")
  .input-box
    span admin
    input(type="radio" name="auth" value="ROLE_ADMIN, ROLE_USER" v-model="user.auth")
    span user
    input(type="radio" name="auth" value="ROLE_USER" v-model="user.auth")
  .input-box
    button(@click="signUp(user)") save

</template>

<script>
import { mapActions } from 'vuex';

export default {
  name: 'HelloWorld',
  props: {
    msg: String,
  },
  data() {
    return {
      user: {
        name: '',
        email: '',
        password: '',
        auth: '',
      },
    };
  },
  methods: {
    ...mapActions([
      'signUp',
    ]),
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}

ul {
  list-style-type: none;
  padding: 0;
}

li {
  display: inline-block;
  margin: 0 10px;
}

a {
  color: #42b983;
}
</style>
