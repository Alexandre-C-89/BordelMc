package com.example.bordelmc.search

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bordelmc.data.CharacterRepo
import com.example.bordelmc.data.api.model.Character
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(
    private val characterRepo: CharacterRepo
): ViewModel(){

    private val _state = MutableStateFlow(emptyList<Character>())
    val state:StateFlow<List<Character>>
        get() = _state

    init {
        viewModelScope.launch {
            val characters = characterRepo.getCharacters()
            _state.value = characters
        }
    }

}