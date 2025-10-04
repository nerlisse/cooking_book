package com.example.cooking_book.models

data class IngredientRequest(
    val name: String,
    val count: Int,
    val unit: String
)