<template>
  <div id="apt">
    <div id="header">
      <main-header/>
      test
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
import MainHeader from './main/MainHeader.vue'
import MainFooter from './main/MainFooter.vue'
import Mainbody from './main/MainBody.vue'
 
export default {
  name: 'Vlider',
  components: {
    'vlider-header': MainHeader,
    'vlider-footer': MainFooter,
    'vlider-body': Mainbody
  }
}
</script>