package io.github.thang86.screens.decrease

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 *
 *    ScopeViewModelFactory.kt
 *
 *    Created by ThangTX on 09/08/2021
 *
 */
class ScoreViewModelFactory(private val score: Int) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DecreaseViewModel::class.java)) {
            return DecreaseViewModel(score) as T
        }
        throw IllegalArgumentException("unknown viewmoodel class")
    }

}