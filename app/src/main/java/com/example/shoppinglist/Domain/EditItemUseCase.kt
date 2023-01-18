package com.example.shoppinglist.Domain

class EditItemUseCase(private val shopListRepository: ShopListRepository) {


    fun editShopItem(shopItem: ShopItem) {
        shopListRepository.editShopItem(shopItem)
    }
}