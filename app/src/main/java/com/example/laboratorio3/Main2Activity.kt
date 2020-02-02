package com.example.laboratorio3

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.laboratorio3.databinding.ActivityMain2Binding

class Main2Activity : AppCompatActivity() {

    lateinit var mBinding:ActivityMain2Binding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main2)

        // Consiguiendo los textos
        var intent = intent
        val title = intent.getStringExtra("placeName")
        val content = intent.getStringExtra("placeDescription")

        // Setting text
        mBinding.titleView.text = title
        mBinding.contentView.text = content
    }

    fun comment(view: View){
        Toast.makeText(this, mBinding.commentText.text, Toast.LENGTH_SHORT).show()
        finish()
    }

}
