package com.example.eepycatto.data.source.remote

import com.example.eepycatto.data.source.remote.response.ExampleResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService :ApiServiceContract{
    @GET("endpoint-here")
    override suspend fun getExampleResponse(): Response<ExampleResponse> {
        TODO("Not yet implemented")
    }
}