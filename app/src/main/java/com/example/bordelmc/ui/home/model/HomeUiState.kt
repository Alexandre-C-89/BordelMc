package com.example.bordelmc.ui.home.model

import com.example.bordelmc.domain.model.Quote

data class HomeUiState(
    val isLoading: Boolean = false,
    val error: String? = null,
    val quotes: List<Quote>? = emptyList()
)