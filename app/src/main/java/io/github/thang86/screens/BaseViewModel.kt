package io.github.thang86.screens

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 *
 *    BaseViewModel.kt
 *
 *    Created by ThangTX on 09/08/2021
 *
 */
open class BaseViewModel : ViewModel() {
    protected val _score = MutableLiveData<Int>()

    open val score: LiveData<Int>
        get() = _score
}