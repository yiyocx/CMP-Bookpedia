package com.plcoding.bookpedia.book.presentation.book_details

import com.plcoding.bookpedia.book.domain.Book

sealed interface BookDetailAction {
    data object OnBackClick : BookDetailAction
    data object OnFavoriteClick : BookDetailAction
    data class OnSelectedBookChange(val book: Book) : BookDetailAction
}
