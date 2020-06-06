package info.sanaebadi.dependencymanagement.ui

import info.sanaebadi.dependencymanagement.data.local.DatabaseService
import info.sanaebadi.dependencymanagement.data.remote.NetworkService

class MainViewModel(val databaseService: DatabaseService, val networkService: NetworkService) {
    val getSomeData: String
        get() = "${databaseService.getDummyData} : : ${networkService.getDummyData}}"
}