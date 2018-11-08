package com.framgia.demo_liveData

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.button_number_one
import kotlinx.android.synthetic.main.activity_main.button_number_two
import kotlinx.android.synthetic.main.activity_main.text_number_one
import kotlinx.android.synthetic.main.activity_main.text_number_two

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        registerLiveData()
        initView()
        RecyclerView.NO_POSITION
    }

    private fun registerLiveData() {
        viewModel.getNumberOne().observe(this,
                Observer<Int> {
                    number -> text_number_one.text = number.toString() })

        viewModel.getNumberTwo().observe(this,
                Observer<Int> {
                    number -> text_number_two.text = number.toString() })
    }

    private fun initView() {
        button_number_one.setOnClickListener(this)
        button_number_two.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.button_number_one -> viewModel.insertNumberOne(2)

            R.id.button_number_two -> viewModel.insertNumberTwo(10)
        }
    }
}
