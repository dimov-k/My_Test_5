package ru.mrroot.my_test_5.presenter.search

import ru.mrroot.my_test_5.presenter.PresenterContract

internal interface PresenterSearchContract : PresenterContract {
    fun searchGitHub(searchQuery: String)
}
