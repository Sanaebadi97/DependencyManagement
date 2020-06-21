package info.sanaebadi.dependencymanagement.di.modules

import dagger.Module
import dagger.Provides
import info.sanaebadi.dependencymanagement.MyApplication
import info.sanaebadi.dependencymanagement.data.local.DatabaseService
import info.sanaebadi.dependencymanagement.data.remote.NetworkService
import javax.inject.Singleton

@Module
public class ApplicationModule(var application: MyApplication) {

    @Singleton
    @Provides
    fun provideNetworkService(): NetworkService {
        return NetworkService(application, "abc")
    }

    @Singleton
    @Provides
    fun provideDatabaseService(): DatabaseService {
        return DatabaseService(application, "xyz ", 1)
    }
}