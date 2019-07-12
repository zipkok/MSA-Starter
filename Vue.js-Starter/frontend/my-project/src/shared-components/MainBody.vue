<template>

    
    <div class="main">
      <h2>Auto Sidebar</h2>
      <p>This sidebar is as tall as its content (the links), and is always shown.</p>
      <p>woobeom Test.</p>
      <p>woobeom Test.</p>
      <p>woobeom Test.</p>
      <p>woobeom Test.</p>
      <p>woobeom Test.</p>
      <p>woobeom Test.</p>
      <p>woobeom Test.</p>
      <p>woobeom Test.</p>
    </div>  

</template>
 
<script>
export default {
  name: 'main-body'
}
</script>
 
<style scoped>
  .main {
    margin-left: 15%; /* 왼쪽에서 15% 정도의 크기만큼 띄워놓는다.*/
    margin-top: 0%; /* 위에서 10%정도의 크기만큼 띄워놓는다. */
    font-size: 28px; /* Increased text to enable scrolling */
    padding: 1px 15px;
    background: black;
    color: white;
    }
</style>