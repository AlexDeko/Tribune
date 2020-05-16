package com.postcrud.core.api

import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.POST
import com.postcrud.feature.data.dto.AuthenticationRequestDto
import com.postcrud.feature.data.dto.AuthenticationResponseDto

interface AuthApi {

    @POST("registration")
    fun signUp(@Body authenticationRequestDto: AuthenticationRequestDto): Single<AuthenticationResponseDto>

    @POST("authentication")
    fun signIn(@Body authenticationRequestDto: AuthenticationRequestDto): Single<AuthenticationResponseDto>
}