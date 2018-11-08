package com.framgia.demo_liveData.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.framgia.demo_liveData.R
import kotlinx.android.synthetic.main.fragment_numner_one.*
import kotlinx.android.synthetic.main.fragment_numner_one.view.*

/**
 * Created by FRAMGIA\le.vu.tan.tuan on 07/11/2018.
 * tantuan127@gmail.com
 */
class NumberOneFragment : Fragment(), View.OnClickListener {


    private lateinit var viewModel: NumberOneFragmentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProviders.of(activity!!).get(NumberOneFragmentViewModel::class.java)
        viewModel.getNumber().observe(this,
                Observer<Int> { number ->
                    text_fragment_one.text = number.toString()
                })
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?): View? {
        var view = inflater.inflate(R.layout.fragment_numner_one, container, false)
        initView(view)
        return view.rootView
    }

    private fun initView(view: View) {
        view.button_send.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button_send -> {
                viewModel.setNumber(3)
            }
        }
    }
}