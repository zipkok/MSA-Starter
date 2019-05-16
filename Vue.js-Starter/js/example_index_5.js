Vue.component('todo-footer', {
    template: '<p>This is another global child component</p>'
});

var cmp = {
    template: '<p>This is another local child component</p>'
}
var app = new Vue({
    el: '#app1',
    data: {
        message: 'This is a components of id=app1'
    },

    components: {
        'todo-list': cmp
    }
})
