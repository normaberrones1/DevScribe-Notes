import { createRouter as createRouter, createWebHistory } from "vue-router";
import { useStore} from "vuex";

import HomeView from "./views/HomeView.vue";
import LoginView from "./views/LoginView.vue";
import RegisterView from "./views/RegisterView.vue";
import LogoutView from "./views/LogoutView.vue";
import MyNotesView from "./views/MyNotesView.vue";

const routes = [

    {
        path: "/",
        name: "home",
        component: HomeView,
        meta: { 
            requiresAuth: true 
        }
    },

    {
        path: "/login",
        name: "Login",
        component: LoginView,
    },

    {
        path: "/register",
        name: "Register",
        component: RegisterView,
    },

    {
        path: "/logout",
        name: "Logout",
        component: LogoutView,
    },

    {
        path: "/my-notes",
        name: "MyNotes",
        component: MyNotesView,
    }

];

const router = createRouter({
    history: createWebHistory(),
    routes: routes
});

router.beforeEach((to) => {
    const store = useStore();

    if (requiresAuth && !store.state.token) {
        return { name: "Login" };
    }
});

export default router;