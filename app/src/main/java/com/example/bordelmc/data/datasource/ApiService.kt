package com.example.bordelmc.data.datasource

import com.example.bordelmc.data.model.QuotesResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("/quotes")
    suspend fun getQuotes() : Response<QuotesResponse>

}