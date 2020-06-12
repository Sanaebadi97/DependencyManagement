package info.sanaebadi.dependencymanagement.di

import info.sanaebadi.dependencymanagement.MyApplication
import info.sanaebadi.dependencymanagement.data.local.DatabaseService
import info.sanaebadi.dependencymanagement.data.remote.NetworkService
import info.sanaebadi.dependencymanagement.ui.MainActivity
import info.sanaebadi.dependencymanagement.ui.MainViewModel

public class DependencyComponent {

    companion object {

        public fun inject(application: MyApplication) {
            application.databaseService = DatabaseService(application, "dummy_db", 1)
            application.networkService = NetworkService(application, "SOME_API_KEY")
        }

        public fun inject(activity: MainActivity) {
            val app = activity.application as MyApplication
            activity.viewModel = MainViewModel(activity, app.databaseService!!, app.networkService!!)
        }
    }
}