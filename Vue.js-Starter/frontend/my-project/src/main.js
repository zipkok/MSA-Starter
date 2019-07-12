import Vue from 'vue'
import App from './App.vue'
import VueRadioToggleButtons from 'vue-radio-toggle-buttons';
import 'vue-radio-toggle-buttons/dist/vue-radio-toggle-buttons.css';

Vue.use(VueRadioToggleButtons);

new Vue({
  el: '#app',
  render: h => h(App)
})
