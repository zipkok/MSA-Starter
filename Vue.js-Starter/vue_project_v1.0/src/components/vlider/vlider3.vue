<template>
    <div class="vlider3">
      <h2>Vlider 3</h2>
      <vlider3-timeline></vlider3-timeline>
    </div>
</template>
 
<script>
import vlider3_timeline from '../timeline/vlider3-timeline.vue'

export default {
  name: 'vlider2',
  components: {
      'vlider3-timeline': vlider3_timeline
  }
}
</script>
 
<style scoped>
  .vlider3 {
    background-color: royalblue;
    padding: 30px;
    text-align: center;
    font-size: 35px;
    color: black;
    }
</style>