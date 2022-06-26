package org.techtown.airpollutionpublicapiapp.tmData

import com.google.gson.annotations.SerializedName

data class TmCordinatesResponse(
    @SerializedName("documents")
    val documents: List<Document>?,
    @SerializedName("meta")
    val meta: Meta?
)