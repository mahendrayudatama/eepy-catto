package com.example.eepycatto.data.repository

import com.example.eepycatto.data.source.local.db.dao.EepycatDao
import com.example.eepycatto.data.source.local.preference.PreferenceManager
import com.example.eepycatto.data.source.remote.ApiService
import com.example.eepycatto.data.source.remote.response.ExampleResponse
import com.example.eepycatto.domain.Status
import com.example.eepycatto.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class UserRepositoryImplementation @Inject constructor(
    private val preference: PreferenceManager,
    private val localDatabase: EepycatDao,
    private val apiService: ApiService
) : UserRepository {
    override fun login(email: String, password: String): Flow<Status<ExampleResponse>> = flow {
        emit(Status.Loading)
        try {
            //do login get data
        } catch (e: Exception) {
            //handle error
        }
    }
}