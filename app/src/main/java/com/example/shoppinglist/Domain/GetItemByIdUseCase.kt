package com.example.shoppinglist.Domain

class GetItemByIdUseCase(private val shopListRepository: ShopListRepository) {
    fun getItemById(shopItemId: Int): ShopItem {
       return shopListRepository.getItemById(shopItemId)
    }
}