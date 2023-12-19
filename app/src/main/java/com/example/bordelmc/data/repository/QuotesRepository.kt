package com.example.bordelmc.data.repository


/**class QuotesRepository @Inject constructor(
    private val api: QuotesApi
) {

    suspend fun getNotes() = flow{
        emit(Resource.Loading())
        val quotes = api.getQuotes().body()?.quotes
        emit(Resource.Success(quotes))
    }.catch { error->
        emit(Resource.Error(error.message!!))
    }

}*/
