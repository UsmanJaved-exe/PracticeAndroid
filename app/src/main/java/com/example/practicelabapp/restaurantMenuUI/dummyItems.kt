package com.example.practicelabapp.restaurantMenuUI

import java.util.UUID

data class DummyItem(
    val name: String,
    val category: String,
    val imageID: Int,
    val currency: String,
    val price: Int,
    val id: String = UUID.randomUUID().toString()
)
