package com.mrphonglinh.example.loigiaihaykt.utils

class AppConstants {
    companion object {
        val BASE_URL = "https://api.loigiaihay.com/v3/"
        //Get list class
        //https://api.loigiaihay.com/v3/tags

        //Get class info
        //https://api.loigiaihay.com/v3/tags/12 (tagId)(api get list class)

        //Get categories https://api.loigiaihay.com/v3/categories/{item_id}
        //https://api.loigiaihay.com/v3/categories/47

        //Get event https://api.loigiaihay.com/v3/events/{eventId} ()
        //https://api.loigiaihay.com/v3/events/616

        //Get detail lesson https://api.loigiaihay.com/v3/articles/%s(articleId) tu articleId = 89
        //https://api.loigiaihay.com/v3/articles/89

        //Search category
        //https://api.loigiaihay.com/v3/article/search?limit=8&page=" + sPStringValue4 + "&keyword=" + sPStringValue + "&catId=" + sPStringValue2;
        //https://api.loigiaihay.com/v3/article/search?limit=8&page=1&keyword=hinh%20hoc&catId=47

        //Image
        //https://www.youtube.com/watch?v=H0QFyXQ7H14
        //Data saved in shared
        val PREF_NAME = "pref_name"
        val IS_FIRST_LAUNCH = "first_launch"//Lan dau chay app
        val KEY_CLASS_ID = "tag_id" //id lop
        val KEY_CLASS_TITLE = "class_title" //title class
        val KEY_SUBJECT_ID = "subject_id" //item_id
        val KEY_SUBJECT_TITLE = "subject_title"//title subject

        val KEY_PRODUCT_ID = "product_id" //Thông tin bài học đang học
        val KEY_SUPPORT_FANPAGE = "support_fanpage"
        val KEY_AD_MOB = "admob_ad_unit_id_event"
        val KEY_AD_POPUP = "ad.adsense.popup.unit_id"

        val KEY_ITEM_ID = "item_id"
        //abc
        val REQUEST_TIMEOUT = 600L

        //Table search
        val TABLE_SEARCH = "tb_search"
        val SEARCH_ID = "search_id"
        val SEARCH_SUBJECT_ID = "search_subject_id"
        val SEARCH_SUBJECT_TYPE = "search_subject_type"
        val SEARCH_NAME_TEXT = "search_name_text"
        val SEARCH_NAME_NOT_SIGNED = "search_name_not_signed"
        val SEARCH_ARTICLE_ID = "search_article_id"
        val SEARCH_IS_LINK = "search_is_link"
        val SEARCH_REDIRECT_LINK = "search_redirect_link"

        /*
        * save	CREATE TABLE save(id_save INTEGER PRIMARY KEY,name_save TEXT,intro_save TEXT,body_save TEXT,url_save TEXT,articleId_save TEXT)
        history	CREATE TABLE history(id_his INTEGER PRIMARY KEY,name_his TEXT,intro_his TEXT,avatar_his TEXT,url_his TEXT,articleId_his TEXT)
        notification_table	CREATE TABLE notification_table(id_notifi INTEGER PRIMARY KEY,title_notifi TEXT,content_notifi TEXT,url_notifi TEXT,date_notifi TEXT,status_notifi TEXT)
        ticked_table	CREATE TABLE ticked_table(id_ticked INTEGER PRIMARY KEY,id_mon_tai TEXT,ten_mon_tai TEXT)
        order_id_table	CREATE TABLE oder_id_table(id_oder_id INTEGER PRIMARY KEY,name_oder_id TEXT)*/

        val DATABASE_NAME = "ktht_db"
        val DATABASE_VERSION = 1
        //Table save
        val TABLE_SAVE = "tb_save"
        val SAVE_ID = "save_id"
        val SAVE_NAME = "save_name"
        val SAVE_INTRO = "save_intro"
        val SAVE_BODY = "save_body"
        val SAVE_URL = "save_url"
        val SAVE_ARTICLE_ID = "save_article_id"

        //TABLE HISTORY
        val TABLE_HISTORY = "tb_history"
        val HISTORY_ID = "history_id"
        val HISTORY_NAME = "history_name"
        val HISTORY_INTRO = "history_intro"
        val HISTORY_AVATAR = "history_avatar"
        val HISTORY_URL = "history_url"
        val HISTORY_ARTICLE_ID = "history_article_id"

        //TABLE NOTIFICATION
        val TABLE_NOTIFICATION = "tb_notification"
        val NOTIFICATION_ID = "notification_id"
        val NOTIFICATION_TITLE = "notification_title"
        val NOTIFICATION_CONTENT = "notification_content"
        val NOTIFICATION_URL = "notification_url"
        val NOTIFICATION_DATE = "notification_date"
        val NOTIFICATION_STATUS = "notification_status"

        //TABLE TICKED
        val TABLE_TICKED = "tb_ticked"
        val TICKED_ID = "ticked_id"
        val TICKED_SUBJECT_ID = "ticked_subject_id"
        val TICKED_SUBJECT_DOWNLOAD = "ticked_subject_download"

        //TABLE ORDERI_D
        val TABLE_ORDER_ID = "tb_order_id"
        val ORDER_ID = "order_id"
        val ORDER_ID_NAME = "order_id_name"

        //TYPE FOR LOAD BASEVENT
        val TYPE_BASE_EVENT = 0
        val TYPE_ARTICLE = 1
        val TYPE_SUB_EVENT = 2
        val KEY_ARTICLE_ID = "article_id"

        //FIRST OPEN ACTIVITY DETAIL
        val KEY_FIRST_OPEN_DETAIL = "first_open_detail"
        val SPACE = " "

        //articleOfflineId
        val KEY_ARTICLE_OFFLINE_ID = "article_offline_id"

        //Key title categories
        val KEY_CATEGORY_TITLE = "category_title"

        //KeyWord when search
        val KEY_WORD_SEARCH = "key_word"
        val LIMIT = 8

        val TIME_DELAY = 2000

    }
}