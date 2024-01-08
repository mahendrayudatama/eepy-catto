package com.example.eepycatto.data.source.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.eepycatto.data.source.local.db.dao.EepycatDao
import com.example.eepycatto.data.source.local.db.entity.SearchEntity

@Database(
    entities = [SearchEntity::class],
    version = 1,
    exportSchema = true
)

abstract class EepycatRoomDatabase : RoomDatabase() {

    abstract fun dao(): EepycatDao
}