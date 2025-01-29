import { createStore as _createStore } from 'vuex';
import axios from 'axios';

export function createStore(currentToken, currentUser){
    let store = _createStore({
        state: {
            token: currentToken || '',
            user: currentUser || {},
        },

        mutations: {
            SET_AUTH_TOKEN(state, token) {
              state.token = token;
              localStorage.setItem('token', token);
              axios.defaults.headers.common['Authorization'] = `Bearer ${token}`;
            },

            SET_USER(state, user) {
                state.user = user;
            },

            CLEAR_USER(state) {
                state.user = {};
            }
        },

        actions: {
            setAuthToken({commit}, token) {
                commit('SET_AUTH_TOKEN', token);
            },

            setUser({commit}, user) {
                commit('SET_USER', user);
            },

        },

        getters: {
            isAuthenticated(state) {
                return !!state.token;
            },

            user(state) {
                return state.user;
            },
        }
    });
    
    return store;
}