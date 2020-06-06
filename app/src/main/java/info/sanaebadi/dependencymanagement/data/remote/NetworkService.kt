package info.sanaebadi.dependencymanagement.data.remote

import android.content.Context

/**
 * Dummy class to simulate the actual NetworkService using Retrofit or OkHttp etc
 */

class NetworkService(context: Context) {
    private val apiKey = "SOME_API_KEY"
    private val getDummyData: String
        get() = "NETWORK_DUMMY_DATA"
}