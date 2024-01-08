package com.example.eepycatto.data.source.remote

import com.example.eepycatto.data.source.remote.response.ExampleResponse
import retrofit2.Response

interface ApiServiceContract {
    suspend fun getExampleResponse():Response<ExampleResponse>
}