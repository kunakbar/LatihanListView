package com.example.mylistview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Vegetable (
        var photo: Int,
        var name: String,
        var description: String
) : Parcelable