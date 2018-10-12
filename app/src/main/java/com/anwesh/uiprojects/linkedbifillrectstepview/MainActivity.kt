package com.anwesh.uiprojects.linkedbifillrectstepview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.bifillrectstepview.BiFillRectStepView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BiFillRectStepView.create(this)
    }
}
