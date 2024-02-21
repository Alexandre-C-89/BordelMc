package com.example.bordelmc.data.model.note

import com.google.firebase.Timestamp

data class NotesModel(
    val userId: String = "",
    val documentId : String = "",
    val noteTitle : String = "",
    val notesDescription : String = "",
    val timeStamp: Timestamp = Timestamp.now(),
    val colorIndex: Int = 0
)