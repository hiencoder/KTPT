package com.mrphonglinh.example.loigiaihaykt.data.event

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

open class Article : BaseEvent() {
    @Expose
    @SerializedName("articleId")
    protected var articleId: Int = 0

    @Expose
    @SerializedName("catId")
    protected var catId: Int = 0

    @Expose
    @SerializedName("publishTime")
    protected var publishTime: Long = 0

    @Expose
    @SerializedName("typeEx")
    protected var typeEx: Int = 0

    @Expose
    @SerializedName("isHot")
    protected var isHot: Int = 0

    /* @Expose
    @SerializedName("is_link")
    protected String isLink;*/

    @Expose
    @SerializedName("thumbnail")
    protected var thumbnail: String = ""

    /*@Expose
    @SerializedName("title")
    protected String title;*/

    @Expose
    @SerializedName("alias")
    protected var alias: String = ""

    @Expose
    @SerializedName("introtext")
    protected var introtext: String = ""
}