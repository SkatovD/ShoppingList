package com.example.shoppinglist.Data.DataBase

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.shoppinglist.Domain.ShopItem

@Dao
interface ShopListDao {
    @Query("Select * from shopList where id ==:shopItemId")
    fun getItem(shopItemId: Int): ShopItem

    @Query("Select * from shopList")
    fun getShopList(): List<ShopItem>

    @Delete
    fun deleteItem(shopItem: ShopItem)

    @Insert
    fun addItem(shopItem: ShopItem)

}