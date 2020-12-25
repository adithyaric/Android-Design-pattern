package com.tokoretro.app.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class News(
    val judul: String ="",
    val link: String ="",
    val poster: String="",
    val tipe:String="",
    val waktu:String=""
) : Parcelable
