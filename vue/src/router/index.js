import { createRouter, createWebHistory } from 'vue-router';
import Home from '../views/Home.vue';

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home,
  },
  {
    path: '/userList',
    name: 'UserList',
    component: () => import('../components/UserList.vue'),
  },
  {
    path: '/signUp',
    name: 'SignUp',
    component: () => import('../components/user/SignUp')
  }
];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});

export default router;
