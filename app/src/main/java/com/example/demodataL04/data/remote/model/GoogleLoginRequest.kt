package com.example.demodataL04.data.remote.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GoogleLoginRequest(
    val token: String,
    @SerialName("device_id") val deviceId: String
)