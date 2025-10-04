package com.example.cooking_book.models
import jakarta.persistence.*

@Entity
@Table(name = "ingredient")
data class Ingredient(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ingredient")
    val idIngredient: Long? = null,

    @Column(name = "nam", length = 50)
    val name: String
) {
    constructor(name: String) : this(null, name)
}