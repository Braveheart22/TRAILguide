package com.johnstrack.trailguide.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import com.johnstrack.trailguide.Adapter.ItemAdapter
import com.johnstrack.trailguide.R
import com.johnstrack.trailguide.Services.DataService
import com.johnstrack.trailguide.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_category_items.*

class CategoryItemsActivity : AppCompatActivity() {

    lateinit var adapter: ItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_items)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        itemText.text = "$categoryType GEAR"

        adapter = ItemAdapter(this, DataService.getItems(categoryType)) {item ->
            println(item.title)
        }
        val layoutManager = GridLayoutManager (this, 2)
        itemListView.layoutManager = layoutManager
        itemListView.adapter = adapter
    }
}