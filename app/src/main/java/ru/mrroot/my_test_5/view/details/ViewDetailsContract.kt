package ru.mrroot.my_test_5.view.details

import ru.mrroot.my_test_5.view.ViewContract

internal interface ViewDetailsContract : ViewContract {
    fun setCount(count: Int)
}
