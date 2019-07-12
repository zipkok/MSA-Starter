<template>
  <div class="vue-header">
    <header id="header">
      <div class="logo">
        <img v-bind:src="'/src/assets/image/logo.png'">
        <!--img v-bind:src="'https://art.nativescript-vue.org/NativeScript-Vue-White-Green.png'"-->
      </div>      
      Header Test
    </header>
  </div>

</template>
 
<script>
export default {
  name: 'main-header'
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