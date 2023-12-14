package com.example.bordelmc.data.repository

import com.example.bordelmc.data.datasource.QuotesApi
import com.example.bordelmc.util.Resource
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class QuotesRepository @Inject constructor(
    private val api: QuotesApi
) {

    suspend fun getNotes() = flow{
        emit(Resource.Loading())
        val quotes = api.getQuotes().body()?.quotes
        emit(Resource.Success(quotes))
    }.catch { error->
        emit(Resource.Error(error.message!!))
    }

}
