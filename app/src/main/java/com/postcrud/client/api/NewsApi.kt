package com.postcrud.client.api

import io.reactivex.Single
import retrofit2.http.GET
import com.postcrud.data.dto.PostResponseDto

interface NewsApi {

    @GET("posts")
    fun getPosts(): Single<List<PostResponseDto>>
}