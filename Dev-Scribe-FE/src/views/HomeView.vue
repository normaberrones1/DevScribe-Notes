<template>
    <div class="home">
  
      <div v-if="isAuthenticated">
          
          <h1>Welcome, {{ user.name }}</h1>
          <p>What skills do you want to sharpen this week?</p>
          <ul>
              <li v-for="note in notes" :key="note.id">
              {{ note.text }}
              </li>
          </ul>
      </div>
          
      <div v-else>
          <router-link to="/login" id="home-login">Log in to see your notes</router-link>
      </div>
  
     
    </div>
  </template>
  
  <script>
  export default {
  
  }
  </script>
  
  <style>
  
  </style>