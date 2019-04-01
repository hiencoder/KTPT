package com.mrphonglinh.example.loigiaihaykt.data.event

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class SubEvent : BaseEvent() {
    @Expose
    @SerializedName("id")
    var id: String = ""

    @Expose
    @SerializedName("itemId")
    var itemId: Int = 0

    /*@Expose
    @SerializedName("title")
     String title;*/

    @Expose
    @SerializedName("short_title")
    var shortTitle: String = ""

    /* @Expose
    @SerializedName("is_link")
     int isLink;*/
}