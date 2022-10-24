package com.example.mvvm.network.api

import com.example.mvvm.network.model.NetworkUser
import com.example.mvvm.network.model.NetworkRepository
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface GitHubApi {

    @GET("orgs/{org}/repos")
    fun getRepos(
        @Path("org") org: String,
        @Query("page") page: Int,
        @Query("per_page") pageSize: Int
    ): List<NetworkRepository>

    @GET("repos/{owner}/{repo}/contributors")
    fun getContributors(
        @Path("owner") owner: String,
        @Path("repo") repoName: String,
        @Query("page") page: Int,
        @Query("per_page") pageSize: Int
    ): List<NetworkUser>

    companion object {
        const val BASE_URL = "https://api.github.com"
    }
}