package com.example.bordelmc.quote.model

import com.example.bordelmc.data.model.Quote

data class UiState(
    val isLoading: Boolean = false,
    val error: String? = null,
    val quotes: List<Quote>? = emptyList()
)