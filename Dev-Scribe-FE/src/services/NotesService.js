import axios from 'axios';

export default {

    getAllNotes() {
        return axios.get('/notes');
    },

    getNoteById(id) {
        return axios.get(`/notes/${id}`);
    },

    createNote(note) {
        return axios.post('/notes', note);
    },

    updateNoteById(id, note) {
        return axios.put(`/notes/${id}`, note);
    },

    deleteNoteById(id) {
        return axios.delete(`/notes/${id}`);
    }

};

