package com.mrphonglinh.example.loigiaihaykt.data.subject

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Subject : Serializable {
    @Expose
    @SerializedName("item_id")
    var itemId: Int = 0

    @Expose
    @SerializedName("item_type")
    var itemType: Int = 0

    @Expose
    @SerializedName("title")
    var title: String? = null

    @Expose
    @SerializedName("alias")
    var alias: String? = null

    @Expose
    @SerializedName("picture")
    var picture: String? = null

    @Expose
    @SerializedName("is_link")
    var isLink: Int = 0

    @Expose
    @SerializedName("redirect_link")
    var redirectLink: String? = null

    @Expose
    @SerializedName("product_id")
    var productId: String? = null
}