package com.example.mvvm.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class NetworkUser(
    @SerialName("id") val id: Long,
    @SerialName("url") val url: String,
    @SerialName("login") val login: String,
    @SerialName("avatar_url") val avatarUrl: String,
    @SerialName("contributions") val contributions: Int
)
