package com.example.bordelmc.home

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bordelmc.data.repository.auth.RemoteDataRepository
import com.example.bordelmc.data.repository.auth.Resources
import com.example.bordelmc.home.model.HomeUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val remoteDataRepository: RemoteDataRepository
) : ViewModel() {
    var homeUiState by mutableStateOf(HomeUiState())

    val currentUser = remoteDataRepository.currentUser()

    val userExists: Boolean
        get() = remoteDataRepository.userExists()

    private val userId: String
        get() = remoteDataRepository.getUserId()


    fun loadNotesData() {
        if (userExists) {
            if (userId.isNotBlank()) {
                getAllNotesData(userId)
            }
        } else {
            homeUiState = homeUiState.copy(
                notesData = Resources.Error(
                    throwable = Throwable("Not Logged In")
                )
            )
        }
    }

    private fun getAllNotesData(userId: String) = viewModelScope.launch {
        remoteDataRepository.getAllNotes(userId).collect {
            Log.i("TAG", "getAllNotesData: ")
            homeUiState = homeUiState.copy(notesData = it)
        }

    }

    fun deleteNote(noteId: String) = remoteDataRepository.deleteNoteFromFirebase(noteId) {
        homeUiState = homeUiState.copy(notesDeletedStatus = it)
    }

    fun signOutUser() = remoteDataRepository.signOutUser()


}