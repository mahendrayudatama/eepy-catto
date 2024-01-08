package com.example.eepycatto.data.source.remote

import com.example.eepycatto.data.source.remote.response.ExampleResponse
import retrofit2.Response

class ApiServiceDummy:ApiServiceContract {
    override suspend fun getExampleResponse(): Response<ExampleResponse> {
        TODO("Not yet implemented")
    }
}