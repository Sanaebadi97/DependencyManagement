package info.sanaebadi.dependencymanagement.data.remote

import android.content.Context

/**
 * Dummy class to simulate the actual NetworkService using Retrofit or OkHttp etc
 */

public class NetworkService constructor(context: Context, val apiKey: String) {
   public val getDummyData: String
        get() = "NETWORK_DUMMY_DATA"
}