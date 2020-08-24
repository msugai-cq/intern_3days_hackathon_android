package com.example.intern_anrdoid_2020

import com.example.intern_anrdoid_2020.model.response.ConnpassResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ConnpassService {
    @GET("event")
    @Headers("Content-Type: application/json")
    fun getEvents(@Query("count") count: Int,
                  @Query("query") query: String?): Call<ConnpassResponse>
}
