package com.johnstrack.trailguide.Services

import com.johnstrack.trailguide.Model.Category
import com.johnstrack.trailguide.Model.Item

/***
 * Created by John on 3/29/2018 at 5:31 PM.
 */
object DataService {
    val categories = listOf(
            Category("HIKING", "hiking"),
            Category("DIVING", "diving"),
            Category("CAMPING", "camping"),
            Category("SURFING", "surfing"),
            Category("FISHING", "fishing"),
            Category("HIKING", "hiking"),
            Category("DIVING", "diving"),
            Category("CAMPING", "camping"),
            Category("SURFING", "surfing"),
            Category("FISHING", "fishing")
    )

    val hiking = listOf(
            Item("TOOLS", "tools"),
            Item("TENT", "tent"),
            Item("MAP", "map"),
            Item("ROPE", "rope"),
            Item("GRILL", "grill"),
            Item("COMPASS", "compass"),
            Item("BACKPACK", "backpack"),
            Item("BOOTS", "boots")
    )
    val diving = listOf(
            Item("ROPE", "rope")
    )
    val camping = listOf(
            Item("TOOLS", "tools"),
            Item("TENT", "tent"),
            Item("MAP", "map"),
            Item("ROPE", "rope"),
            Item("GRILL", "grill"),
            Item("COMPASS", "compass"),
            Item("BACKPACK", "backpack"),
            Item("BOOTS", "boots")
    )
    val surfing = listOf(
            Item("ROPE", "rope")
    )
    val fishing = listOf(
            Item("ROPE", "rope")
    )

    fun getItems (category: String) : List<Item> {

        return when (category) {
            "HIKING" -> hiking
            "DIVING" -> diving
            "CAMPING" -> camping
            "SURFING" -> surfing
            else -> fishing
        }
    }
}