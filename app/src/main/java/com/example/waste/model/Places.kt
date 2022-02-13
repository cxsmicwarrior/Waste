package com.example.waste.model

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = "places", indices = [Index("place", unique = true)])
data class Places(
    @PrimaryKey val place: String
)