package com.example.cooking_book

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CookingBookApplication

fun main(args: Array<String>) {
	runApplication<CookingBookApplication>(*args)
}
