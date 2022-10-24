package com.example.mvvm.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class NetworkRepository(
    @SerialName("id") val id: Long,
    @SerialName("url") val url: String,
    @SerialName("name") val name: String,
    @SerialName("html_url") val htmlUrl: String,
    @SerialName("private") val isPrivate: Boolean
)
