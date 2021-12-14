package ru.mrroot.my_test_5.view.search

import ru.mrroot.my_test_5.model.SearchResult
import ru.mrroot.my_test_5.view.ViewContract

internal interface ViewSearchContract : ViewContract {
    fun displaySearchResults(
        searchResults: List<SearchResult>,
        totalCount: Int
    )

    fun displayError()
    fun displayError(error: String)
    fun displayLoading(show: Boolean)
}
