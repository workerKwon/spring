<template>
  <div class="home">
    <img alt="Vue logo" src="../assets/logo.png">
    <SignIn msg="Welcome to Your Vue.js App"/>
  </div>
</template>

<script>
// @ is an alias to /src
import SignIn from '@/components/user/SignIn.vue';

export default {
  name: 'Home',
  components: {
    SignIn,
  },
};
</script>
