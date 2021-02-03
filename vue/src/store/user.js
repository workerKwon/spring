import request from '@/utils/request';
import router from "@/router";

export default {
  state: {
    user: {},
    userList: [],
  },
  getters: {
    user: (state) => state.user,
    userList: (state) => state.userList,
  },
  actions: {
    signUp(store, user) {
      request.post('/signUp', user)
        .then((res) => {
          store.commit('setUser', res.data);
        })
        .catch((err) => {
          console.log(err);
        });
    },
    signIn(store, form) {
      request.post('/signIn', form)
        .then((res) => {
          console.log(res.data)
          router.push('/userList')
        })
        .catch((err) => {
          console.log(err)
          router.push('/')
        })
    },
    signOut(store) {
      request.post('/signOut')
        .then(response => {
        window.localStorage.clear();
        router.push('/')
      })
    },
    getUserList(store) {
      request.get('/getList')
        .then((res) => {
          store.commit('setUserList', res.data);
        })
        .catch((err) => {
          console.log(err);
        });
    },
    deleteAll(store) {
      request.delete('/deleteAll')
        .then(() => {
          store.dispatch('getUserList');
        })
        .catch((err) => {
          console.log(err);
        });
    },
    deleteId(store, id) {
      request.delete(`${id}`)
        .then(() => {
          store.dispatch('getUserList');
        })
        .catch((err) => {
          console.log(err);
        });
    },
  },
  mutations: {
    setUser(state, user) {
      state.user = user;
    },
    setUserList(state, userList) {
      state.userList = userList;
    },
  },
};
