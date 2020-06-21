package info.sanaebadi.dependencymanagement.di.component

import android.app.Application
import dagger.Component
import info.sanaebadi.dependencymanagement.di.modules.ApplicationModule

@Component(modules = [ApplicationModule::class])
public interface ApplicationComponent {
    fun inject(application: Application)
}