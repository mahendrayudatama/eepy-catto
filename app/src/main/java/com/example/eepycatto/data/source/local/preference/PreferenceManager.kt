package com.example.eepycatto.data.source.local.preference

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Suppress("Since15")
@Singleton
class PreferenceManager @Inject constructor(
    private val datastore: DataStore<Preferences>
) {
    private object Keys {
        val EXAMPLE_PREFERENCE_KEY = stringPreferencesKey("eepy_catto")
    }

    val getExamplePreferenceKey: Flow<String> = datastore.data.map {
        it[Keys.EXAMPLE_PREFERENCE_KEY] ?: "ayaya"
    }

    suspend fun setExamplePreference(someString: String) {
        datastore.edit {
            it[Keys.EXAMPLE_PREFERENCE_KEY] = someString
        }
    }

}