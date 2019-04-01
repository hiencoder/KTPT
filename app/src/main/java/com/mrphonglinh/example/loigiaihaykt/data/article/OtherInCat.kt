package com.mrphonglinh.example.loigiaihaykt.data.article

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class OtherInCat : Serializable {
    @Expose
    @SerializedName("articleId")
    var articleId: Int = 0

    @Expose
    @SerializedName("catId")
    var catId: Int = 0

    @Expose
    @SerializedName("publishTime")
    var publishTime: Long = 0

    @Expose
    @SerializedName("is_link")
    var isLink: Int = 0

    @Expose
    @SerializedName("thumbnail")
    var thumbnail: String = ""

    @Expose
    @SerializedName("title")
    var title: String = ""

    @Expose
    @SerializedName("alias")
    var alias: String = ""

    @Expose
    @SerializedName("introtext")
    var introtext: String = ""
}