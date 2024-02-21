package com.example.bordelmc.home.model

import com.example.bordelmc.data.model.note.NotesModel
import com.example.bordelmc.data.repository.auth.Resources

data class HomeUiState(
    val notesData: Resources<List<NotesModel>> = Resources.Loading(),
    val notesDeletedStatus: Boolean = false
)