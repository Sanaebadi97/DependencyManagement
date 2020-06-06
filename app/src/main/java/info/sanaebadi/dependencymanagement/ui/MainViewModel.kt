package info.sanaebadi.dependencymanagement.ui

import android.content.Context
import info.sanaebadi.dependencymanagement.data.local.DatabaseService
import info.sanaebadi.dependencymanagement.data.remote.NetworkService

class MainViewModel(context: Context) {
    private val databaseService = DatabaseService(context)
    private val networkService = NetworkService(context)
    val getSomeData: String
        get() = "${databaseService.getDummyData} : : ${networkService.getDummyData}}"
}