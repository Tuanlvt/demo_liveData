package com.framgia.demo_liveData.fragment

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

/**
 * Created by FRAMGIA\le.vu.tan.tuan on 07/11/2018.
 * tantuan127@gmail.com
 */
class NumberOneFragmentViewModel(application: Application) : AndroidViewModel(application) {

    private var textFragmentOne: MutableLiveData<Int> = MutableLiveData()

    init {
        textFragmentOne.value = 0
    }

    fun getNumber(): MutableLiveData<Int> = textFragmentOne

    fun setNumber(number: Int) {
        textFragmentOne.value = textFragmentOne.value!! + number
    }
}
