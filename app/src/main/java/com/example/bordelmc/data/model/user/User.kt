package com.example.bordelmc.data.model.user

class User (
    val id: Int,
    val name: String,
    val username: String,
    val email: String,
    val address: List<Address>,
)