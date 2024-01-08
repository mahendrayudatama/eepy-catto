package com.example.eepycatto.data.source.local.db.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.eepycatto.data.source.local.db.entity.SearchEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface EepycatDao {

    @Query("SELECT * FROM search_entity ORDER BY id DESC LIMIT 10 ")
    fun getRecentSearch(): Flow<List<SearchEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(search: SearchEntity)

    @Delete
    suspend fun delete(search: SearchEntity)

    @Query("DELETE FROM search_entity")
    suspend fun deleteAll()

    @Query("SELECT EXISTS(SELECT * FROM search_entity WHERE keyword=:keyword)")
    fun searchDuplicate(keyword: String): Flow<Boolean>

    @Query("DELETE FROM search_entity WHERE keyword=:keyword")
    suspend fun deleteByKeyword(keyword: String)

}