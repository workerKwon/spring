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
        td {{user.age}}
        td
          button(@click="deleteId(user.id)") delete
  button(@click="deleteAll") deleteAll
</template>

<script>
import {mapGetters, mapActions} from 'vuex'
export default {
  name: "UserList",
  computed: {
    ...mapGetters([
      'userList',
    ])
  },
  methods: {
    ...mapActions([
      'getUserList',
      'deleteAll',
      'deleteId'
    ])
  },
  mounted() {
    this.getUserList();
  }
}
</script>

<style scoped>

</style>
