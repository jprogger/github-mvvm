package com.example.mvvm.network.di

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.example.mvvm.network.api.GitHubApi
import dagger.Module
import dagger.Provides
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class NetworkModule {

    @Provides
    @Singleton
    fun provideGitHubApi(retrofit: Retrofit): GitHubApi {
        return retrofit.create(GitHubApi::class.java)
    }

    @Provides
    @Singleton
    @OptIn(ExperimentalSerializationApi::class)
    fun provideRetrofit(client: OkHttpClient): Retrofit {
        val contentType = "application/json".toMediaType()
        return Retrofit.Builder()
            .client(client)
            .baseUrl(GitHubApi.BASE_URL)
            .addConverterFactory(json.asConverterFactory(contentType))
            .build()
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor { chain ->
                val original = chain.request()
                val builder = original.newBuilder()
                    .header("Accept", "application/vnd.github.v3+json")
                val request = builder.build()
                chain.proceed(request)
            }
            .build()
    }

    private val json = Json { ignoreUnknownKeys = true }
}