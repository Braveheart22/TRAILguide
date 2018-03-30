package com.johnstrack.trailguide.Services

import com.johnstrack.trailguide.Model.Category

/***
 * Created by John on 3/29/2018 at 5:31 PM.
 */
object DataService {
    val categories = listOf(
            Category("HIKING", "hiking"),
            Category("CAMPING", "camping"),
            Category("DIVING", "diving"),
            Category("SURFING", "surfing"),
            Category("FISHING", "fishing")
    )
}