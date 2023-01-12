package com.example.shoppinglist.Domain

class EditItemUseCase(private val shopListRepository: ShopListRepository) {

    fun editItem(shopItem: ShopItem) {
        shopListRepository.editItem(shopItem)
    }
}