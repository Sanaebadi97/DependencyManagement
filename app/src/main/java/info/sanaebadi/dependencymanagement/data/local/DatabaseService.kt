package info.sanaebadi.dependencymanagement.data.local

import android.content.Context

/*
 * Dummy class to simulate the actual Database using Room or Realm etc
 */

data class DatabaseService(val context: Context, val databaseName: String, val version: Int) {

    val getDummyData: String
        get() = "DATABASE_DUMMY_DATA"
}

