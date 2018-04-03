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
            Item("TOOLS", "tools", ""),
            Item("TENT", "tent", ""),
            Item("MAP", "map", ""),
            Item("ROPE", "rope", ""),
            Item("COMPASS", "compass", ""),
            Item("BACKPACK", "backpack", ""),
            Item("BOOTS", "boots", "")
    )
    val diving = listOf(
            Item("OXYGEN", "ox", ""),
            Item("FLIPPERS", "ox_flippers", ""),
            Item("OXYGEN MASK", "ox_mask", ""),
            Item("MASK", "mask", ""),
            Item("KNIFE", "knife", "")
    )
    val camping = listOf(
            Item("TOOLS", "tools", ""),
            Item("TENT", "tent", "Tents are an absolute necessity for camping. They provide shelter and warmth. There are many different types of tents with varying sizes and purposes.\n\nWe recommend the Coleman WeatherMaste Tent."),
            Item("MAP", "map", ""),
            Item("ROPE", "rope", ""),
            Item("GRILL", "grill", ""),
            Item("COMPASS", "compass", ""),
            Item("BACKPACK", "backpack", ""),
            Item("BOOTS", "boots", "")
    )
    val surfing = listOf(
            Item("SURFBOARD", "surfboard", "")
    )
    val fishing = listOf(
            Item("FISHING ROD", "fishing_rod", ""),
            Item("HOOK", "hook", ""),
            Item("LURE", "lure", ""),
            Item("KNIFE", "knife", "")
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