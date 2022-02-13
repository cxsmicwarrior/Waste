package com.example.waste.model

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.example.waste.model.Places

@Entity(tableName = "shopping_list_items", indices = [Index("item", unique = true)])
data class Item(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val item: String,
    @Embedded val places: Places
)