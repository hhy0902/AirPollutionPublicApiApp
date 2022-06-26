package org.techtown.airpollutionpublicapiapp.stationData


import com.google.gson.annotations.SerializedName

data class Station(
    @SerializedName("response")
    val response: Response?
)