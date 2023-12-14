package com.example.bordelmc.data.datasource

import com.example.bordelmc.QuotesResponse
import retrofit2.Response
import retrofit2.http.GET

interface QuotesApi {

    @GET("/quotes")
    suspend fun getQuotes(): Response<QuotesResponse>

}