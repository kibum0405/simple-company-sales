<template>
    <div>
        <String label="SalesOrderNumber" v-model="value.salesOrderNumber" :editMode="editMode"/>
        <String label="SalesPerson" v-model="value.salesPerson" :editMode="editMode"/>
        <String label="Status" v-model="value.status" :editMode="editMode"/>
        <CompanyId offline label="CompanyId" v-model="value.companyId" :editMode="editMode" @change="change"/>
        <SalesType offline label="SalesType" v-model="value.salesType" :editMode="editMode" @change="change"/>
        <SalesItemsDetailGrid label="SalesItems" offline v-model="value.salesItems" :editMode="editMode" @change="change"/>

        <v-divider class="border-opacity-100 my-divider"></v-divider>
        <v-layout row justify-end>
            <v-btn
                width="64px"
                color="primary"
                @click="save"
            >
                저장
            </v-btn>
        </v-layout>
    </div>
</template>


<script>

import BaseEntity from './base-ui/BaseEntity'

export default {
    name: 'SalesOrder',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "salesOrders"
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>

