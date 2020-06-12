package info.sanaebadi.dependencymanagement

import android.app.Application
import info.sanaebadi.dependencymanagement.data.local.DatabaseService
import info.sanaebadi.dependencymanagement.data.remote.NetworkService
import info.sanaebadi.dependencymanagement.di.DependencyComponent

class MyApplication : Application() {

    var networkService: NetworkService? = null
    var databaseService: DatabaseService? = null


    override fun onCreate() {
        super.onCreate()

        DependencyComponent.inject(this)
    }
}