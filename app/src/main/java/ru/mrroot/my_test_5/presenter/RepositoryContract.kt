package ru.mrroot.my_test_5.presenter

import ru.mrroot.my_test_5.repository.RepositoryCallback

internal interface RepositoryContract {
    fun searchGithub(
        query: String,
        callback: RepositoryCallback
    )
}
