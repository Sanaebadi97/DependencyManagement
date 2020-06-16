package info.sanaebadi.dependencymanagement.di.component

import dagger.Component
import info.sanaebadi.dependencymanagement.di.modules.ApplicationModule

@Component(modules = [ApplicationModule::class])
public interface ApplicationComponent {
    fun inject()
}