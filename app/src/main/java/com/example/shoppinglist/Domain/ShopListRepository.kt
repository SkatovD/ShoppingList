package com.example.shoppinglist.Domain

import androidx.lifecycle.LiveData

interface ShopListRepository {

    fun addItem(shopItem: ShopItem)

    fun getShopList(): LiveData<List<ShopItem>>

    fun deleteItem(shopItem: ShopItem)

    fun editItem(shopItem: ShopItem)

    fun getItemById(shopItemId: Int): ShopItem
}