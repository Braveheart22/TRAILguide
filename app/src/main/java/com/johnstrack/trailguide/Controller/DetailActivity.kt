package com.johnstrack.trailguide.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.johnstrack.trailguide.Model.Item
import com.johnstrack.trailguide.R
import com.johnstrack.trailguide.Utilities.EXTRA_ITEM
import kotlinx.android.synthetic.main.activity_category_items.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val item = intent.getParcelableExtra<Item>(EXTRA_ITEM)
        println("${item.title} WORKS!!!")

    }
}
