package com.example.cooking_book.models

import jakarta.persistence.*
import lombok.Data
import lombok.NoArgsConstructor


@Table(name = "recipe")
@Entity
@Data
@NoArgsConstructor
data class Recipe(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_recipe")
    val idRecipe: Long? = null,

    @Column(name = "title", length = 50)
    var title: String,

    @Column(name = "description")
    var description: String,

    @Column(name = "photo_url")
    var photoUrl: String
    ) {
    constructor() : this(title = "", description = "", photoUrl = "")
}