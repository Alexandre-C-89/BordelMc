package com.example.bordelmc

data class UiState(
    val isLoading: Boolean = false,
    val error: String? = null,
    val quotes: List<Quote>? = emptyList()
)
