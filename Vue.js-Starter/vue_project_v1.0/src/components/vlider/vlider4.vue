<template>
    <div class="vlider4">
      <h2>Vlider 4</h2>
      <vlider4-timeline></vlider4-timeline>
    </div>
</template>
 
<script>
import vlider4_timeline from '../timeline/vlider4-timeline.vue'

export default {
  name: 'vlider$',
  components: {
      'vlider4-timeline': vlider4_timeline
  }
}
</script>
 
<style scoped>
  .vlider4 {
    background-color: grey;
    padding: 30px;
    text-align: center;
    font-size: 35px;
    color: black;
    }
</style>