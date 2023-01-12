package com.example.shoppinglist.Data

import android.app.Application
import com.example.shoppinglist.Data.DataBase.AppDataBase
import com.example.shoppinglist.Domain.ShopItem
import com.example.shoppinglist.Domain.ShopListRepository

object ShopListRepositoryImpl : ShopListRepository {

    private val shopList = mutableListOf<ShopItem>()

    private var autoIncrementId = 0
    private val db: AppDataBase = AppDataBase.getInstance(Application())

    override fun addItem(shopItem: ShopItem) {
        if (shopItem.id == ShopItem.UNDEFINED_ID) {
            shopItem.id = autoIncrementId++

        }
        db.shopListDao().addItem(shopItem)

    }

    override fun getShopList(): List<ShopItem> {

        return db.shopListDao().getShopList()
    }

    override fun deleteItem(shopItem: ShopItem) {
        db.shopListDao().deleteItem(shopItem)
    }

    override fun editItem(shopItem: ShopItem) {
        val oldElement = getItemById(shopItem.id)
        shopList.remove(oldElement)
        shopList.add(shopItem)
    }

    override fun getItemById(shopItemId: Int): ShopItem {
        return db.shopListDao().getItem(shopItemId)
    }
}