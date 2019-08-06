package com.skydoves.themovies.models.network

import com.skydoves.themovies.models.Genre
import com.skydoves.themovies.models.NetworkResponseModel

data class GenreListResponse(
        val genres: List<Genre>
) : NetworkResponseModel