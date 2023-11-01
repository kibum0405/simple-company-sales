
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import SalesOrderManager from "./components/ui/SalesOrderGrid"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/salesOrders',
                name: 'SalesOrderManager',
                component: SalesOrderManager
            },




    ]
})
