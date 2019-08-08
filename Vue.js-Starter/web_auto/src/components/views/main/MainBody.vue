<template>
    <div class="main">
      <h2>Auto Sidebar</h2>
      <p>This sidebar is as tall as its content (the links), and is always shown.</p>

      <div id="vlider1">
        <vlider1/>
      </div>

      <div id="vlider2">
        <vlider2/>
      </div>  

      <div id="vlider3">
        <vlider3/>
      </div>

      <div id="vlider4">
        <vlider4/>
      </div>
    </div>  
</template>
 
<script>
import Vlider1 from './vlider/vlider1.vue'
import Vlider2 from './vlider/vlider2.vue'
import Vlider3 from './vlider/vlider3.vue'
import Vlider4 from './vlider/vlider4.vue'

export default {
  name: 'main-body',
  components: {
    'vlider1': Vlider1,
    'vlider2': Vlider2,
    'vlider3': Vlider3,
    'vlider4': Vlider4
  }
}
</script>
 
<style scoped>
  .main {
    margin-left: 15%;
    margin-top: 0%;
    font-size: 28px; 
    padding: 1px 15px;
    background: black;
    color: white;
    }
</style>