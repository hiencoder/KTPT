package com.mrphonglinh.example.loigiaihaykt.data.subject

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.mrphonglinh.example.loigiaihaykt.data.ConfigInfo
import java.io.Serializable

class SubjectResponse : Serializable {
    @Expose
    @SerializedName("list_data")
    var listData: List<SubjectData>? = null

    @Expose
    @SerializedName("cfg_info")
    var configInfo: ConfigInfo? = null
}