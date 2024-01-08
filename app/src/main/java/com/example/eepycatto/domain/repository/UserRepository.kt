package com.example.eepycatto.domain.repository

import com.example.eepycatto.data.source.remote.response.ExampleResponse
import com.example.eepycatto.domain.Status
import kotlinx.coroutines.flow.Flow

interface UserRepository {
    fun login(email: String, password: String): Flow<Status<ExampleResponse>>
}