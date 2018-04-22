package com.johnstrack.trailguide.Model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/***
 * Created by John on 4/2/2018 at 3:00 PM.
 */
@Parcelize
class Item (val title: String, val image: String, val description: String, val amazonUrl: String) : Parcelable