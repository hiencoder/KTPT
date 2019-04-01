package com.mrphonglinh.example.loigiaihaykt.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

public class ConfigInfo : Serializable {
    @Expose
    @SerializedName("last_cfg_time")
    var lastCfgTime: String = ""

    @Expose
    @SerializedName("ad.popup_frequency")
     var adPopupFrequency: String = ""

    @Expose
    @SerializedName("ad.adsense.detail_bottom.unit_id")
     var adAdsenseDetail: String = ""

    @Expose
    @SerializedName("ad.adsense.popup.unit_id")
     var adAdsensePopup: String = ""

    @Expose
    @SerializedName("current.force.update.version")
     var currentForceUpdate: String = ""

    @Expose
    @SerializedName("support.email")
     var supportEmail: String = ""

    @Expose
    @SerializedName("support.fanpage")
     var supportFanpage: String = ""

    @Expose
    @SerializedName("popup_rating_after")
     var popupRatingAfter: String = ""

    @Expose
    @SerializedName("admob.app_id")
     var admobAppId: String = ""

    @Expose
    @SerializedName("admob.unit.article_detail_bottom")
     var admobUnitArticleDetailBottom: String = ""

    @Expose
    @SerializedName("admob.unit.article_detail_top")
     var admobUnitArticleDetailTop: String = ""

    @Expose
    @SerializedName("admob.unit.event_article_top")
     var admobUnitEventArticleTop: String = ""

    @Expose
    @SerializedName("admob.unit.interestial")
     var admobUnitInterestial: String = ""

    @Expose
    @SerializedName("latest_version")
     var latestVersion: String = ""

    @Expose
    @SerializedName("force_update")
     var forceUpdate: Boolean = false
}