package com.mrphonglinh.example.loigiaihaykt.data.search

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.mrphonglinh.example.loigiaihaykt.data.event.Article

class ArticleSearch: Article() {
    @Expose
    @SerializedName("picture")
    private val picture: String? = null
}