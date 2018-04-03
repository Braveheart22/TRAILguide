package com.johnstrack.trailguide.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.johnstrack.trailguide.Model.Item
import com.johnstrack.trailguide.R
import com.johnstrack.trailguide.Utilities.EXTRA_ITEM
import kotlinx.android.synthetic.main.activity_detail.*



class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val item = intent.getParcelableExtra<Item>(EXTRA_ITEM)
        val context = itemDetailImage.context
        val resourceId = context.resources.getIdentifier(item.image, "drawable", context.packageName)

        itemDetailImage.setImageResource(resourceId)
        specificItemText.text = item.title
        itemDetailText.text = item.description
    }

    fun openAmazonLink(view: View){
        println("Open the Amazon item in a browser.")
    }
}