package com.mrphonglinh.example.loigiaihaykt.data.tag

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.mrphonglinh.example.loigiaihaykt.data.ConfigInfo
import java.io.Serializable

class ResponseTag : Serializable {
    @Expose
    @SerializedName("list_class")
    var listClass: List<ClassEntity>? = null

    @Expose
    @SerializedName("cfg_info")
    var configInfo: ConfigInfo? = null
}