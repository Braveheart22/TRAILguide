package com.johnstrack.trailguide.Controller

import android.content.Intent
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

    lateinit var adapter: ItemAdapter

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
        val layoutManager = GridLayoutManager (this, 2)
        itemListView.layoutManager = layoutManager
        itemListView.adapter = adapter
    }
}