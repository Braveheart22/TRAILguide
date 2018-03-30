package com.johnstrack.trailguide.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.johnstrack.trailguide.Adapter.CategoryRecycleAdapter
import com.johnstrack.trailguide.R
import com.johnstrack.trailguide.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Number of categories: ${DataService.categories.count()}")

        adapter = CategoryRecycleAdapter(this, DataService.categories)
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager (this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)
    }
}