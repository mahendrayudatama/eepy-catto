package com.example.eepycatto.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class ExampleResponse(
    @field:SerializedName("data")
    val data: LoginData,
    @field:SerializedName("success")
    val success: Boolean
)

data class LoginData(
    @field:SerializedName("token")
    val accessToken: String
)
