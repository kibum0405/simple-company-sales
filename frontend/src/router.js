
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import SalesSalesOrderManager from "./components/listers/SalesSalesOrderCards"
import SalesSalesOrderDetail from "./components/listers/SalesSalesOrderDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/sales/salesOrders',
                name: 'SalesSalesOrderManager',
                component: SalesSalesOrderManager
            },
            {
                path: '/sales/salesOrders/:id',
                name: 'SalesSalesOrderDetail',
                component: SalesSalesOrderDetail
            },




    ]
})
