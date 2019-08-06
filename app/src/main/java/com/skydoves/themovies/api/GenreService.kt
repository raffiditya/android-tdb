package com.skydoves.themovies.api

import androidx.lifecycle.LiveData
import com.skydoves.themovies.models.network.GenreListResponse
import retrofit2.http.GET

interface GenreService {

    @GET("/3/genre/movie/list")
    fun fetchGenreList(): LiveData<ApiResponse<GenreListResponse>>
}