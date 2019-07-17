<template>
  <div id="app">
    <div id="header">
      <main-header/>
    </div>
    
    <div id="nav">
      <main-side/>
    </div>

    <div id="body">
      <main-body/>
    </div>

    <div id="footer">
      <main-footer/>
    </div>
  </div>
</template>
 
<script>
import MainHeader from './components/MainHeader.vue'
import MainFooter from './components/MainFooter.vue'
import MainSide from './components/MainSide.vue'
import Mainbody from './components/MainBody.vue'
 
export default {
  name: 'app',
  components: {
    'main-header': MainHeader,
    'main-footer': MainFooter,
    'main-side': MainSide,
    'main-body': Mainbody
  }
}
</script>
 
<style>

</style>

<style  lang="scss" scoped>
    @import "./src/assets/styles/global.scss";
</style>
