package com.plcoding.bookpedia

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.plcoding.bookpedia.book.domain.Book
import com.plcoding.bookpedia.book.presentation.book_list.BookListScreen
import com.plcoding.bookpedia.book.presentation.book_list.BookListState
import com.plcoding.bookpedia.book.presentation.book_list.components.BookSearchBar

@Preview(showBackground = true)
@Composable
private fun BookSearchPreview() {
    MaterialTheme {
        BookSearchBar(
            modifier = Modifier.fillMaxWidth(),
            searchQuery = "",
            onSearchQueryChange = {},
            onImeSearch = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun BookListScreenPreview() {
    BookListScreen(
        state = BookListState(
            searchResults = books
        ),
        onAction = { }
    )
}

private val books = (1..100).map {
    Book(
        id = it.toString(),
        title = "Book $it",
        imageUrl = "https://test.com",
        authors = listOf("Author $it"),
        description = "Description of Book $it",
        languages = emptyList(),
        firstPublishYear = null,
        averageRating = 4.67855,
        ratingCount = 5,
        numPages = 120,
        numEditions = 2
    )
}
