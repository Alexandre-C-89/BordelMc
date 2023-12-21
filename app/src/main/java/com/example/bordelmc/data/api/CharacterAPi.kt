package com.example.bordelmc.data.api

import com.example.bordelmc.data.api.model.Character
import retrofit2.http.GET

interface CharacterAPi {

    @GET(ApiConstants.END_POINT)
    suspend fun getCharacter(): List<Character>

}