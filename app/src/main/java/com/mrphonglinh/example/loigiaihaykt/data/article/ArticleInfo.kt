package com.mrphonglinh.example.loigiaihaykt.data.article

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ArticleInfo : Serializable {
    @Expose
    @SerializedName("articleId")
    var articleId: Int = 0

    @Expose
    @SerializedName("catId")
    var catId: Int = 0

    @Expose
    @SerializedName("catTitle")
    var catTitle: String = ""

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
    var introText: String = ""

    @Expose
    @SerializedName("content")
    var content: String = ""

    @Expose
    @SerializedName("display_type")
    var displayType: Int = 0

    @Expose
    @SerializedName("cmt_count")
    var cmtCount: Int = 0

    @Expose
    @SerializedName("zip_status")
    var zipStatus: Int = 0

    @Expose
    @SerializedName("last_modified_time")
    var lastModifiedTime: Long = 0

    @Expose
    @SerializedName("last_zip_time")
    var lastZipTime: Long = 0

    @Expose
    @SerializedName("zip_link")
    var zipLink: String = ""

    @Expose
    @SerializedName("picture")
    var picture: String = ""

    @Expose
    @SerializedName("comment_url")
    var commentUrl: String = ""

    @Expose
    @SerializedName("origin_url")
    var originUrl: String = ""
}