package io.github.thang86.screens.increase

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import io.github.thang86.screens.BaseViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 *
 *    IncreaseViewModel.kt
 *
 *    Created by ThangTX on 09/08/2021
 *
 */
class IncreaseViewModel : ViewModel() {

    // The current score
    private val _score = MutableLiveData(0)

    val score: LiveData<Int>
        get() = _score

    init {
        Log.i("IncreaseViewModel", "IncreaseViewModel  created....")
    }

    fun onInrease(param: Int) {
        _score.value = param
//        _score.postValue()
    }

}