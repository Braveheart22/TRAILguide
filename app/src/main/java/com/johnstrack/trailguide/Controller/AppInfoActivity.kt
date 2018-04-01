package com.johnstrack.trailguide.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.johnstrack.trailguide.R

class AppInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_info)
    }

    fun backToAppClicked () {
        finish()
    }
}