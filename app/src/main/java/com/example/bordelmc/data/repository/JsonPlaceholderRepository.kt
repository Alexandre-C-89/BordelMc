package com.example.bordelmc.data.repository

import com.example.bordelmc.data.datasource.ApiService
import com.example.bordelmc.data.utils.Resource
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class JsonPlaceholderRepository @Inject constructor(
    private val api: ApiService
) {
    suspend fun getNotes() = flow{
        emit(Resource.Loading())
        val quotes = api.getQuotes().body()?.quotes
        emit(Resource.Success(quotes))
    }.catch { error->
        emit(Resource.Error(error.message!!))
    }
}