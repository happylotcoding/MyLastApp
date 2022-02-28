package com.easycom.domain.register

import com.easycom.data.common.utils.WrappedResponse
import com.easycom.data.register.remote.dto.RegisterRequest
import com.easycom.data.register.remote.dto.RegisterResponse
import com.easycom.domain.common.base.BaseResult
import com.easycom.domain.register.entity.RegisterEntity
import kotlinx.coroutines.flow.Flow

interface RegisterRepository {
    suspend fun register(registerRequest: RegisterRequest)
    : Flow<BaseResult<RegisterEntity, WrappedResponse<RegisterResponse>>>

}