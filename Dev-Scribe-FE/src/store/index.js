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
            }
        }
    });
    
    return store;
}