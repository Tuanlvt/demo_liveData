package com.framgia.demo_liveData

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

/**
 * Created by FRAMGIA\le.vu.tan.tuan on 07/11/2018.
 * tantuan127@gmail.com
 */
class MainViewModel(application: Application) : AndroidViewModel(application) {

    private var numberOne: MutableLiveData<Int> = MutableLiveData()
    private var numberTwo: MutableLiveData<Int> = MutableLiveData()

    init {
        numberOne.value = 0
        numberTwo.value = 0
    }

    fun getNumberOne(): MutableLiveData<Int> = numberOne

    fun getNumberTwo(): MutableLiveData<Int> = numberTwo

    fun insertNumberOne(number: Int) {
        numberOne.value = numberOne.value!! + number
    }

    fun insertNumberTwo(number: Int) {
        numberTwo.value = numberTwo.value!! + number
    }
}
