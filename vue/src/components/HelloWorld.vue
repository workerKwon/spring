<template lang="pug">
#hello
  .input-box
    p name
    input(type="text" v-model="user.name")
  .input-box
    p age
    input(type="text" v-model="user.age")
  .input-box
    button(@click="saveUser(user)") save

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
        age: '',
      },
    };
  },
  methods: {
    ...mapActions([
      'saveUser',
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
