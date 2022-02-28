package com.easycom.data.register.remote.api

import com.easycom.data.common.utils.WrappedResponse
import com.easycom.data.register.remote.dto.RegisterRequest
import com.easycom.data.register.remote.dto.RegisterResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface RegisterApi {
    @POST("auth/register")
    suspend fun register(@Body registerRequest: RegisterRequest)
            : Response<WrappedResponse<RegisterResponse>>
}