package com.mrphonglinh.example.loigiaihaykt.data.category

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class CatInfo : Serializable {
    @Expose
    @SerializedName("picture")
    var picture: String = ""

    @Expose
    @SerializedName("title")
    var title: String = ""

    @Expose
    @SerializedName("alias")
    var alias: String = ""

    @Expose
    @SerializedName("description")
    var description: String = ""

    @Expose
    @SerializedName("contentBoxAbove")
    var contentBoxAbove: String = ""

    @Expose
    @SerializedName("contentBoxBelow")
    var contentBoxBelow: String = ""

    @Expose
    @SerializedName("app_note")
    var appNote: String = ""

    @Expose
    @SerializedName("zip_status")
    var zipStatus: Int = 0

    @Expose
    @SerializedName("last_zip_time")
    var lastZipTime: Long = 0

    @Expose
    @SerializedName("itemId")
    var itemId: Int = 0

    @Expose
    @SerializedName("product_id")
    var productId: String? = ""
}