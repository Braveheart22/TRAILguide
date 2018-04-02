package com.johnstrack.trailguide.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.johnstrack.trailguide.R
import com.johnstrack.trailguide.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class CategoryItemsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_items)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        categoryItemText.text = "$categoryType GEAR"
    }
}