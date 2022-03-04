package com.roksui.buildingguidebackend.service

import com.roksui.buildingguidebackend.datasource.StoreDataSource
import com.roksui.buildingguidebackend.model.Store
import org.springframework.stereotype.Service

@Service
class StoreService(private val dataSource: StoreDataSource) {

    fun getStores(): Collection<Store> = dataSource.retrieveStores()

}