package com.example.waste.dao

import androidx.room.*
import com.example.waste.model.Item

@Dao
interface ItemDao {

    @Delete
    fun delete(item: Item)

    @Update
    fun update(item: Item)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(item: Item)

    @Query("SELECT * FROM shopping_list_items")
    fun getAll(): List<Item>
}