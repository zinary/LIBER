package com.zinary.liber.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ProductionCompanies(
    @SerializedName("id") val id: Int,
    @SerializedName("logo_path") val logoPath: String,
    @SerializedName("name") val name: String,
    @SerializedName("origin_country") val originCountry: String
) : Parcelable