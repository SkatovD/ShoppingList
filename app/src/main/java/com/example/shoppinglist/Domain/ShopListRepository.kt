package com.example.shoppinglist.Domain

interface ShopListRepository {

    fun addItem(shopItem: ShopItem)

    fun getShopList(): List<ShopItem>

    fun deleteItem(shopItem: ShopItem)

    fun editItem(shopItem: ShopItem)

    fun getItemById(shopItemId: Int): ShopItem
}