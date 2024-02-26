package com.personal.weathering.data.remote

import com.personal.weathering.data.models.SearchDto
import retrofit2.http.GET
import retrofit2.http.Query

interface SearchApi {

    @GET("v1/search?count=10&format=json")
    suspend fun getSearchData(
        @Query("name") query: String,
        @Query("language") language: String
    ): SearchDto
}