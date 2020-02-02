package com.example.laboratorio3

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.laboratorio3.databinding.ActivityMainBinding

class SecondActivity: AppCompatActivity() {

    lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_second)


    }

    fun comment(view: View){
        finish()
    }
}