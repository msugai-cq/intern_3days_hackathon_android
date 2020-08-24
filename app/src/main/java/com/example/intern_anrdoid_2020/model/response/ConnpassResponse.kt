package com.example.intern_anrdoid_2020.model.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ConnpassResponse(
        @SerialName("results_start")
        val resultsStart: Long,

        @SerialName("results_returned")
        val resultsReturned: Long,

        @SerialName("results_available")
        val resultsAvailable: Long,

        val events: List<Event>
)

@Serializable
data class Event(
        @SerialName("event_id")
        val eventID: Long,

        val title: String,
        val catch: String,
        val description: String,

        @SerialName("event_url")
        val eventURL: String,

        @SerialName("started_at")
        val startedAt: String,

        @SerialName("ended_at")
        val endedAt: String,

        val limit: Long? = null,

        @SerialName("hash_tag")
        val hashTag: String,

        @SerialName("event_type")
        val eventType: String,

        val accepted: Long,
        val waiting: Long,

        @SerialName("updated_at")
        val updatedAt: String,

        @SerialName("owner_id")
        val ownerID: Long,

        @SerialName("owner_nickname")
        val ownerNickname: String,

        @SerialName("owner_display_name")
        val ownerDisplayName: String,

        val place: String?,
        val address: String?,
        val lat: Any? = null,
        val lon: Any? = null,
        val series: Series
)

@Serializable
data class Series(
        val id: Long,
        val title: String,
        val url: String
)

@Serializable
data class EventType(
        val participation: String,
        val advertisement: String
)