package com.example.bordelmc.data.datasource

import com.example.bordelmc.data.model.quote.QuotesResponse
import com.example.bordelmc.data.model.user.UsersResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("/quotes")
    suspend fun getQuotes() : Response<QuotesResponse>

    @GET("/users")
    suspend fun getUsers(): Response<UsersResponse>

}