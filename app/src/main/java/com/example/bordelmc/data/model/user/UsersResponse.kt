package com.example.bordelmc.data.model.user

data class UsersResponse(
    val users: List<User>,
    val total: Int
)