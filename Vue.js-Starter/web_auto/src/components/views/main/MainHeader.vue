<template>
  <div class="vue-header">
    <header id="header">
      <div class="logo">
        <!--img v-bind:src="'~/assets/logo.png'"-->
        <img v-bind:src="'static/logo.png'">
      </div>      
      Header Test
    </header>
  </div>

</template>
 
<script>
export default {
  name: 'main-header',
  imagetwo: 'https://www.gstatic.com/webp/gallery3/1.sm.png'
}

</script>
 
<style scoped>
  header {
    background-color: #666;
    padding: 30px;
    text-align: center;
    font-size: 35px;
    color: white;
    }
</style>