package com.example.eepycatto.di

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.PreferenceDataStoreFactory
import androidx.datastore.preferences.preferencesDataStoreFile
import androidx.room.Room
import com.example.eepycatto.data.source.local.db.EepycatRoomDatabase
import com.example.eepycatto.data.source.local.db.dao.EepycatDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import java.util.prefs.Preferences
import javax.inject.Singleton

private const val USER_PREFERENCES = "user_preferences"

@Module
@InstallIn(SingletonComponent::class)
class LocalModule {
    @Singleton
    @Provides
    fun provideDatastor(@ApplicationContext appContext: Context): DataStore<androidx.datastore.preferences.core.Preferences> {
        return PreferenceDataStoreFactory.create {
            appContext.preferencesDataStoreFile(USER_PREFERENCES)
        }
    }
    @Singleton
    @Provides
    fun provideRoomDatabase(@ApplicationContext context: Context): EepycatRoomDatabase {
        return Room.databaseBuilder(
            context,
            EepycatRoomDatabase::class.java,
            "eepy-catto.db"
        ).build()
    }
    @Provides
    @Singleton
    fun provideDao(db: EepycatRoomDatabase): EepycatDao {
        return db.dao()
    }

}