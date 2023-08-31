package com.learn.apk_intent_oby

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PersonOby(
    val name: String?,
    val age: Int?,
    val email: String?,
    val city: String?
) : Parcelable