package com.example.bordelmc.note_screen

import com.example.bordelmc.data.model.note.NotesModel
data class NotesScreenUiState(
    val noteTitle: String = "",
    val notesDescription: String = "",
    val colorIndex: Int = 0,
    val noteAddedStatus: Boolean = false,
    val noteUpdatedStatus: Boolean = false,
    val notesSelected: NotesModel? = null
)
