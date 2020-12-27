package com.tokoretro.app.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class News(
//    val judul: String ="",
//    val link: String ="",
//    val poster: String="",
//    val tipe:String="",
//    val waktu:String=""

    val amiiboSeries: String ="",
    val character : String = "",
    val gameSeries: String = "",
    val image : String = "",
    val name : String ="",
    //release
    val head:String ="",
    val tail:String ="",
    val type:String ="",
) : Parcelable
