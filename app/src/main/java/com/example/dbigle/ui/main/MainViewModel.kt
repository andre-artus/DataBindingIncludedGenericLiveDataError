package com.example.dbigle.ui.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val _state = MutableLiveData<UiState<Boolean>>()
    val state: LiveData<UiState<Boolean>>
        get() = _state


    fun runTest() {
        Log.d("state", state.toString())
        viewModelScope.launch {
            _state.postValue(UiState.loading(null))
            delay(1000)
            _state.value = UiState.success(true)
        }

    }
}


