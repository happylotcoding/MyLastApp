package com.easycom.domain.register.usecase

import com.easycom.data.common.utils.WrappedResponse
import com.easycom.data.register.remote.dto.RegisterRequest
import com.easycom.data.register.remote.dto.RegisterResponse
import com.easycom.domain.common.base.BaseResult
import com.easycom.domain.register.RegisterRepository
import com.easycom.domain.register.entity.RegisterEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RegisterUseCase @Inject constructor(private val registerRepository: RegisterRepository) {

    suspend fun invoke(registerRequest: RegisterRequest)
    : Flow<BaseResult<RegisterEntity, WrappedResponse<RegisterResponse>>> {
        return registerRepository.register(registerRequest)
    }
}