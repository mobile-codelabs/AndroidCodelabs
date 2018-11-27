package com.mobile_codelabs.live_data

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val mobileCodeLabsTitle: String = "Mobile Code Labs"
    val increaseTitle: String = "Increase"

    val counter: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }
    init {
        counter.value = 0
    }

    fun increase() {
        counter.value = counter.value?.plus(1)
    }
}