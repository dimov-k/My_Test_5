package ru.mrroot.my_test_5.presenter.details

import ru.mrroot.my_test_5.presenter.PresenterContract

internal interface PresenterDetailsContract : PresenterContract {
    fun setCounter(count: Int)
    fun onIncrement()
    fun onDecrement()
}
