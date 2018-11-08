package com.framgia.demo_liveData.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.framgia.demo_liveData.R
import kotlinx.android.synthetic.main.fragment_number_two.text_fragment_two

/**
 * Created by FRAMGIA\le.vu.tan.tuan on 07/11/2018.
 * tantuan127@gmail.com
 */
class NumberTwoFragment : Fragment() {

    private lateinit var viewModel:NumberOneFragmentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProviders.of(activity!!).get(NumberOneFragmentViewModel::class.java)
        viewModel.getNumber().observe(this,
                Observer<Int> { number -> text_fragment_two.text = number.toString() })
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_number_two, container, false).rootView
    }
}