package com.mrphonglinh.example.loigiaihaykt.data.article

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.mrphonglinh.example.loigiaihaykt.data.ConfigInfo
import java.io.Serializable

class ResponseArticle : Serializable {
    @Expose
    @SerializedName("cfg_info")
    var configInfo: ConfigInfo? = null

    @Expose
    @SerializedName("articleInfo")
    var articleInfo: ArticleInfo? = null

    @Expose
    @SerializedName("relateArticles")
    var relateArticles: List<RelateArticle>? = null

    @Expose
    @SerializedName("othersInCat")
    var otherInCats: List<OtherInCat>? = null

    @Expose
    @SerializedName("eventInfo")
    var eventInfo: EventInfo? = null

    @Expose
    @SerializedName("banner")
    var banner: List<Banner>? = null
}