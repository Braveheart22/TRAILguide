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
        categoryHeader.text = getString(R.string.category_header, categoryType)

        this.adapter = ItemAdapter(this, DataService.getItems(categoryType)) { item ->
            val itemIntent = Intent(this, DetailActivity::class.java)
            itemIntent.putExtra(EXTRA_ITEM, item)
            startActivity(itemIntent)
        }
        val spanCount = computeColumnSpan()

        val layoutManager = GridLayoutManager(this, spanCount)
        itemListView.layoutManager = layoutManager
        itemListView.adapter = adapter
    }

    private fun computeColumnSpan(): Int {
        var spanCount = 2
        val orientation = resources.configuration.orientation
        val layout = resources.configuration.screenLayout and Configuration.SCREENLAYOUT_SIZE_MASK

        if (orientation == Configuration.ORIENTATION_LANDSCAPE) spanCount++
        if (layout == Configuration.SCREENLAYOUT_SIZE_XLARGE) spanCount++
        return spanCount
    }
}