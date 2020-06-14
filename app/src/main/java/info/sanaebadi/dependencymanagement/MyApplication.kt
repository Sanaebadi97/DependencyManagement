package info.sanaebadi.dependencymanagement

import android.app.Application
import info.sanaebadi.dependencymanagement.data.local.DatabaseService
import info.sanaebadi.dependencymanagement.data.remote.NetworkService
import javax.inject.Inject

class MyApplication : Application() {

    @Inject
    var networkService: NetworkService? = null

    @Inject
    var databaseService: DatabaseService? = null


    override fun onCreate() {
        super.onCreate()

    }
}