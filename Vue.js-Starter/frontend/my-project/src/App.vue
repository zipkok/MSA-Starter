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
import MainHeader from './shared-components/MainHeader.vue'
import MainFooter from './shared-components/MainFooter.vue'
import MainSide from './shared-components/MainSide.vue'
import Mainbody from './shared-components/MainBody.vue'
 
export default {
  name: 'App',
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

<!--style>
  @import './assets/css/demo.css'
</style-->
