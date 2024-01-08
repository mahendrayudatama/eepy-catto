package com.example.eepycatto.data.source.local.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

//for recent search history
@Entity("search_entity")
data class SearchEntity(
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0,
    val keyword : String
)
