package com.example.shoppinglist.Presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoppinglist.Data.ShopListRepositoryImpl
import com.example.shoppinglist.Domain.DeleteItemUseCase
import com.example.shoppinglist.Domain.EditItemUseCase
import com.example.shoppinglist.Domain.GetShopListUseCase
import com.example.shoppinglist.Domain.ShopItem

class MainViewModel : ViewModel() {
    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteItemUseCase = DeleteItemUseCase(repository)
    private val editItemUseCase = EditItemUseCase(repository)
    val shopList = getShopListUseCase.getShopList()


    fun deleteItem(shopItem: ShopItem) {
        deleteItemUseCase.deleteItem(shopItem)
    }

    fun changeEnabledState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editItemUseCase.editItem(newItem)
    }
}