package io.github.thang86.screens.decrease

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 *
 *    DecreaseViewModel.kt
 *
 *    Created by ThangTX on 09/08/2021
 *
 */
class DecreaseViewModel(scope: Int) : ViewModel() {

    private val _score = MutableLiveData(scope)

    val score: LiveData<Int>
        get() = _score

    /**
     * The func use
     */
    fun onDecrease(param: Int) {
        viewModelScope.launch(Dispatchers.Main) {
            delay(200)
            _score.value = param
        }
    }

}