package com.example.bordelmc.data

import com.example.bordelmc.data.api.CharacterAPi
import com.example.bordelmc.data.api.model.Character
import javax.inject.Inject

class CharacterRepo @Inject constructor(
    private val characterAPi: CharacterAPi
){

    suspend fun getCharacters(): List<Character> {
        return characterAPi.getCharacter()
    }

}