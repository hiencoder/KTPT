package com.mrphonglinh.example.loigiaihaykt.data.search

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.mrphonglinh.example.loigiaihaykt.data.ConfigInfo

class ResponseSearch {
    @Expose
    @SerializedName("listArticles")
    var articleSearchList: List<ArticleSearch>? = null

    @Expose
    @SerializedName("cfg_info")
    var configInfo: ConfigInfo? = null

    @Expose
    @SerializedName("total")
    var total: Int = 0
}