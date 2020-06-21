package info.sanaebadi.dependencymanagement.ui

import android.content.Context
import info.sanaebadi.dependencymanagement.data.local.DatabaseService
import info.sanaebadi.dependencymanagement.data.remote.NetworkService

public class MainViewModel(context: Context, var databaseService: DatabaseService, var networkService: NetworkService) {
    val getSomeData: String
        get() = "${databaseService.getDummyData} : : ${networkService.getDummyData}}"
}