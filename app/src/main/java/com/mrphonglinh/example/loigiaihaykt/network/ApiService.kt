package com.mrphonglinh.example.loigiaihaykt.network

import com.mrphonglinh.example.loigiaihaykt.data.article.ResponseArticle
import com.mrphonglinh.example.loigiaihaykt.data.category.ResponseCategory
import com.mrphonglinh.example.loigiaihaykt.data.event.ResponseEvent
import com.mrphonglinh.example.loigiaihaykt.data.search.ResponseSearch
import com.mrphonglinh.example.loigiaihaykt.data.subject.SubjectResponse
import com.mrphonglinh.example.loigiaihaykt.data.tag.ResponseTag
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import rx.Single

interface ApiService {
    //Lấy danh sách lớp học
    @GET("tags")
    fun getListClass(): Single<ResponseTag>

    //Lấy danh sách môn học theo lớp
    @GET("tags/{tagId}")
    fun getListSubjectByTagId(@Path("tagId") tagId: String): Single<SubjectResponse>

    //Lấy danh sách category theo id môn học
    @GET("categories/{subjectId}")
    fun getResponseCategory(@Path("subjectId") subjectId: Int): Single<ResponseCategory>

    //Lấy danh sách article
    @GET("events/{itemId}")
    fun getResponseEventByItemId(@Path("itemId") itemId: Int): Single<ResponseEvent>

    //Lấy chi tiết bài học bởi id
    @GET("articles/{articleId}")
    fun getArticleByArticleId(@Path("articleId") articleId: Int): Single<ResponseArticle>

    //Lấy danh sách bài học tìm kiếm đc
    @GET("article/search")
    fun getSearch(
        @Query("limit") limit: Int,
        @Query("page") page: Int,
        @Query("keyword") keyWord: String,
        @Query("catId") catId: Int
    ): Single<ResponseSearch>
}