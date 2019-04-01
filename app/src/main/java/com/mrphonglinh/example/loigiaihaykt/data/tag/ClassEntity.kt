package com.mrphonglinh.example.loigiaihaykt.data.tag

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ClassEntity : Serializable {
    @Expose
    @SerializedName("tagId")
    var tagId: String = ""

    @Expose
    @SerializedName("title")
    var title: String = ""

    @Expose
    @SerializedName("picture")
    var picture: String = ""

    @Expose
    @SerializedName("product_id")
    var productId: String = ""

}