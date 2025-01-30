import axios from 'axios';

export default {

    register(user) {
        return axios.post('/register', user);
    },

    login(user) {
        return axios.post('/login', user);
    },
    
    logout() {
        return axios.post('/logout');
    },

    getUser() {
        return axios.get('/user');
    },

};