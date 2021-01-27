import request from "@/utils/request";

export default {
  state: {
    user: {},
    userList: []
  },
  getters: {
    user: state => state.user,
    userList: state => state.userList,
  },
  actions: {
    saveUser(store, user) {
      request.post('/create', user)
        .then(res => {
          store.commit('setUser', res.data)
        })
        .catch(err => {
          console.log(err)
        })
    },
    getUserList(store) {
      request.get('/getList')
        .then(res => {
          store.commit('setUserList', res.data)
        })
        .catch(err => {
          console.log(err)
        })
    }
  },
  mutations: {
    setUser(state, user) {
      state.user = user
    },
    setUserList(state, userList) {
      state.userList = userList
    }
  },
}
