package com.example.zerod

data class Hobby (var title:String)

object Supplier {
    val hobbies = listOf<Hobby>(
        Hobby("Second Review"),
        Hobby("Swimming"),
        Hobby("Play Games"),
        Hobby("Project Delta"),
        Hobby("Spread Sheet getting"),
    )
}