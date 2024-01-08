package com.example.eepycatto.di

import com.example.eepycatto.data.source.remote.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton


private const val BASE_DEV_URL = "" //raamo will fill this in
@Module
@InstallIn(SingletonComponent::class)
class RemoteModule {

    @Provides
    fun provideOkhttpClient(): OkHttpClient {
        val loggingInterceptor = run {
                HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
        }
        return OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .readTimeout(0, TimeUnit.MILLISECONDS)
            .build()
    }

    @Provides
    fun provideRetrofit(client: OkHttpClient): Retrofit {
        val gson = GsonConverterFactory.create()
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_DEV_URL)
            .client(client)
            .addConverterFactory(gson)
        return retrofit.build()
    }

    @Provides
    @Singleton
    fun provideApiService(retrofitInstance: Retrofit): ApiService {
        return retrofitInstance.create(ApiService::class.java)
    }
}