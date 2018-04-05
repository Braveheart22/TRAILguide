package com.johnstrack.trailguide.Controller

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import com.johnstrack.trailguide.Adapter.ItemAdapter
import com.johnstrack.trailguide.R
import com.johnstrack.trailguide.Services.DataService
import com.johnstrack.trailguide.Utilities.EXTRA_CATEGORY
import com.johnstrack.trailguide.Utilities.EXTRA_ITEM
import kotlinx.android.synthetic.main.activity_category_items.*

class CategoryItemsActivity : AppCompatActivity() {

    private lateinit var adapter: ItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_items)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        specificItemText.text = "$categoryType GEAR"

        this.adapter = ItemAdapter(this, DataService.getItems(categoryType)) { item ->
            val itemIntent = Intent (this, DetailActivity::class.java)
            itemIntent.putExtra(EXTRA_ITEM, item)
            startActivity(itemIntent)
        }

        var spanCount = 2
        var tabletColumns = 0
        val orientation = resources.configuration.orientation
        val screenWidth = resources.configuration.screenWidthDp

        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spanCount = 3
        }

        if (screenWidth > 800) {
            tabletColumns = 1
        }

        val layoutManager = GridLayoutManager (this, spanCount + tabletColumns)
        itemListView.layoutManager = layoutManager
        itemListView.adapter = adapter
    }
}