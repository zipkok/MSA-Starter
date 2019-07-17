<template>
  <div class="vlider2">
    <div id="app">
      <div class="wrapper">
        <section class="vlider-first">
        <h2 id="title">Vlider 2</h2>
          <div class="site-container">
            <div class="components">
              <div class="component full light">
                <vlider :id="'light'" :vlider-data="lightSlider" :theme="'theme-light'" v-model="inputRange" @click="vliderClick">
                  <template slot="bullet" slot-scope="bullet">
                    <label>{{ bullet.data.label }}</label>
                    <i class="em" :class="[`em-${bullet.data.extras.icon}`]"></i> 
                    <a target="_blank" :href="bullet.data.extras.learnMore">작업 중</a>
                  </template>
                </vlider><p></p>
                <vlider2-timeline></vlider2-timeline>
              </div>
            </div>
          </div>
        </section>
      </div>
    </div>
  </div>
</template>
 
<script>
  import vlider2_timeline from '../timeline/vlider2-timeline.vue'
  import Vue from 'vue'
  import Vlider from "vlider";
  import VueHighlightJS from 'vue-highlightjs';
  Vue.use(VueHighlightJS)
  
  export default {
    name: 'vlider2',
    components: {
        'vlider2-timeline': vlider2_timeline,
        'vlider': Vlider
    },
    data() {
      return {
        inputRange: null,
        lightSlider: [
          {
              label: "1",
              color: "#3a0088",
              extras: {
                  learnMore: 'http://localhost/'
              }
          },
          {
              label: "2",
              color: "#ff5733",
              extras: {
                  learnMore: 'http://localhost/'
              }
          },
          {
              label: "3",
              color: "#c70039",
              extras: {
                  learnMore: 'http://localhost/'
              }
          },
          {
              label: "4",
              color: "#ff7657",
              extras: {
                  learnMore: 'http://localhost/'
              }
          },
          {
              label: "5",
              color: "#ffc60b",
              extras: {
                  learnMore: 'http://localhost/'
              }
          },
          {
              label: "6",
              color: "#6effbf",
              extras: {
                  learnMore: 'http://localhost/'
              }
          }
        ]
      };
    },
    watch: {
      inputRange() {
        console.log(this.inputRange)
      }
    },
    methods: {
      vliderClick(value) {
        console.log(`clicked`)
        console.log(value)
      }
    }
  };
</script>
 
<style lang="sass">
    @import "./src/assets/styles/global.scss";
</style>
