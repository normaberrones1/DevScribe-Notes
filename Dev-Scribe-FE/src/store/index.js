// import { createStore } from 'vuex';
// import axios from 'axios';

// export default createStore({
//     state: {
//         items: [],
//         loading: false,
//         error: null
//     },

//     mutations: {
//         setItems(state, items) {
//             state.items = items;
//         },
//         setLoading(state, loading) {
//             state.loading = loading;
//         },
//         setError(state, error) {
//             state.error = error;
//         }
//     },

//     actions: {
//         async fetchItems({ commit }) {
//             commit('setLoading', true);
//             try {
//                 const response = await axios.get('https://jsonplaceholder.typicode.com/posts');
//                 commit('setItems', response.data);
//             } catch (error) {
//                 commit('setError', error.message);
//             }
//             commit('setLoading', false);
//         }
//     },

//     getters: {
//         items: state => state.items,
//         loading: state => state.loading,
//         error: state => state.error
//     }
// });