<template lang="pug">
#user-list
  table
    thead
      tr
        td name
        td age
    tbody
      tr(v-for="user in userList")
        td {{user.name}}
        td {{user.email}}
        td {{user.auth}}
        td
          button(@click="deleteId(user.id)") delete
  button(@click="deleteAll") deleteAll
  button(@click="onClickSignOut") sign out
</template>

<script>
import { mapGetters, mapActions } from 'vuex';

export default {
  name: 'UserList',
  computed: {
    ...mapGetters([
      'userList',
    ]),
  },
  methods: {
    ...mapActions([
      'getUserList',
      'deleteAll',
      'deleteId',
      'signOut'
    ]),
    onClickSignOut() {
      this.signOut();
    }
  },
  mounted() {
    this.getUserList();
  },
};
</script>

<style scoped>

</style>
