package com.bangkit.views

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

// Add parcelable data class
@Parcelize
data class Hero(
    var name:String,
    var description: String,
    var photo: Int
) : Parcelable
