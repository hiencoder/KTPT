package com.mrphonglinh.example.loigiaihaykt.data.event

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.mrphonglinh.example.loigiaihaykt.data.ConfigInfo
import java.io.Serializable

class ResponseEvent:Serializable {
    @Expose
    @SerializedName("eventInfo")
    private val eventInfo: EventInfo? = null

    @Expose
    @SerializedName("cfg_info")
    private val configInfo: ConfigInfo? = null

    @Expose
    @SerializedName("listArticles")
    private val listArticles: List<Article>? = null

    @Expose
    @SerializedName("mostViews")
    private val mostViews: List<MostView>? = null

    @Expose
    @SerializedName("listSubEvent")
    private val subEvents: List<SubEvent>? = null
}