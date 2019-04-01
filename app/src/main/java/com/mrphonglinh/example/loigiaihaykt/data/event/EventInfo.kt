package com.mrphonglinh.example.loigiaihaykt.data.event

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class EventInfo : Serializable {
    @Expose
    @SerializedName("title")
    var title: String = ""

    @Expose
    @SerializedName("catId")
    var catId: Int = 0

    @Expose
    @SerializedName("alias")
    var alias: String = ""

    @Expose
    @SerializedName("introtext")
    var introtext: String = ""

    @Expose
    @SerializedName("itemId")
    var itemId: Int = 0

    @Expose
    @SerializedName("itemType")
    var itemType: Int = 0

    @Expose
    @SerializedName("picture")
    var picture: String = ""

    @Expose
    @SerializedName("catTitle")
    var catTitle: String = ""

    @Expose
    @SerializedName("contentBoxAbove")
    var contentBoxAbove: String = ""
}