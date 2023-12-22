package com.example.bordelmc.data.model.quote

import com.example.bordelmc.data.model.quote.Quote

data class QuotesResponse(
    val quotes : List<Quote>,
    val total : Int
)
