package com.mrphonglinh.example.loigiaihaykt.data.category

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.mrphonglinh.example.loigiaihaykt.data.ConfigInfo
import java.io.Serializable

class ResponseCategory : Serializable {
    @Expose
    @SerializedName("cfg_info")
    var configInfo: ConfigInfo? = null

    @Expose
    @SerializedName("catInfo")
    var catInfo: CatInfo? = null

    @Expose
    @SerializedName("listEvents")
    var listEvents: List<Event>? = null
}