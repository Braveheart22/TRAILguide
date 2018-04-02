package com.johnstrack.trailguide.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.johnstrack.trailguide.Model.Item
import com.johnstrack.trailguide.R

/**
 * Created by John on 4/2/2018 at 3:45 PM.
 */
class ItemAdapter(private val context: Context, private val items: List<Item>, private val itemClick: (Item) -> Unit): RecyclerView.Adapter<ItemAdapter.ItemHolder> () {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ItemHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.category_item_item, parent, false)
        return ItemHolder(view, itemClick)
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: ItemHolder?, position: Int) {
        holder?.bindItem(items[position], context)
    }

    inner class ItemHolder(itemView: View?, private val itemClick: (Item) -> Unit) : RecyclerView.ViewHolder(itemView) {

        private val itemImage = itemView?.findViewById<ImageView>(R.id.itemImage)

        fun bindItem(item: Item, context: Context) {
            val resourceId = context.resources.getIdentifier(item.image, "drawable", context.packageName)
            itemImage?.setImageResource(resourceId)
            itemView.setOnClickListener { itemClick (item) }
        }
    }
}