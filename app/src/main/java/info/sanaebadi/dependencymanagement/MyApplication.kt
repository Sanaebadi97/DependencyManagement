package info.sanaebadi.dependencymanagement

import android.app.Application
import info.sanaebadi.dependencymanagement.data.local.DatabaseService
import info.sanaebadi.dependencymanagement.data.remote.NetworkService
import info.sanaebadi.dependencymanagement.di.component.ApplicationComponent
import info.sanaebadi.dependencymanagement.di.component.DaggerApplicationComponent
import info.sanaebadi.dependencymanagement.di.modules.ApplicationModule
import javax.inject.Inject


class MyApplication : Application() {

    var applicationComponent: ApplicationComponent? = null

    @Inject
    public lateinit var networkService: NetworkService

    @Inject
    public lateinit var databaseService: DatabaseService


    override fun onCreate() {
        super.onCreate()
        DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
                .inject(this)


    }


}