package com.plcoding.bookpedia.book.presentation.book_details

import com.plcoding.bookpedia.book.domain.Book

data class BookDetailState(
    val isLoading: Boolean = true,
    val isFavorite: Boolean = false,
    val book: Book? = null
)
