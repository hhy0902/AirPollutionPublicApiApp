package org.techtown.airpollutionpublicapiapp.AirPollutionData


import com.google.gson.annotations.SerializedName

data class Pollution(
    @SerializedName("response")
    val response: Response?
)