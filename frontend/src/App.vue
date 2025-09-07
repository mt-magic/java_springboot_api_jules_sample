<script setup>
import { ref, onMounted } from 'vue';
import axios from 'axios';

const users = ref([]);
const error = ref(null);

onMounted(async () => {
  try {
    // The Spring Boot API is running on port 8080
    const response = await axios.get('http://localhost:8080/api/users');
    users.value = response.data;
  } catch (e) {
    console.error('Error fetching users:', e);
    error.value = 'Failed to fetch user data. Make sure the backend is running.';
  }
});
</script>

<template>
  <main>
    <h1>User List</h1>
    <div v-if="error" class="error">
      <p>{{ error }}</p>
    </div>
    <div v-else-if="users.length > 0">
      <table>
        <thead>
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="user in users" :key="user.id">
            <td>{{ user.id }}</td>
            <td>{{ user.name }}</td>
            <td>{{ user.age }}</td>
          </tr>
        </tbody>
      </table>
    </div>
    <div v-else>
      <p>Loading users...</p>
    </div>
  </main>
</template>

<style scoped>
main {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}

table {
  width: 80%;
  margin: 20px auto;
  border-collapse: collapse;
}

th, td {
  border: 1px solid #ddd;
  padding: 8px;
}

th {
  background-color: #42b983;
  color: white;
}

.error {
  color: red;
  font-weight: bold;
}
</style>
