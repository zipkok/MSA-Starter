<template>
    <div class="sidenav">
      <a href="#about">About</a>
      <a href="#services">Services</a>
      <a href="#clients">Clients</a>
      <a href="#contact">Contact</a>
    </div>
</template>
 
<script>
export default {
  name: 'main-side'
}
</script>
 
<style scoped>
  .sidenav {
    width: 15%;
    position: fixed;
    z-index: 1;
    background: green;
    overflow-x: hidden;
    padding: 8px 0;
    }
    .sidenav a {
      padding: 6px 8px 6px 16px;
      text-decoration: none;
      font-size: 25px;
      color: white;
      display: block;
    }
</style>