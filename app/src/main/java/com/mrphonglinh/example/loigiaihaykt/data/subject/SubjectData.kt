package com.mrphonglinh.example.loigiaihaykt.data.subject

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class SubjectData: Serializable {
    @Expose
    @SerializedName("book_type")
     var bookType: String? = ""

    @Expose
    @SerializedName("title")
     var title: String? = ""

    @Expose
    @SerializedName("tab_color_code")
     var tabColorCode: String? = ""

    @Expose
    @SerializedName("base_url")
     var baseUrl: String? = ""

    @Expose
    @SerializedName("list_subject")
     var listSubject: List<Subject>? = null
}