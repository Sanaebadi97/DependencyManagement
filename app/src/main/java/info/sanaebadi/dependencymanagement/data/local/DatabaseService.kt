package info.sanaebadi.dependencymanagement.data.local

import android.content.Context

/*
 * Dummy class to simulate the actual Database using Room or Realm etc
 */

class DatabaseService(context: Context) {
    private val databaseName = "dummy_db"
    private val version = 1

    val dummyData: String
        get() = "DATABASE_DUMMY_DATA"
}