package com.example.movieapp.feature_movies.data.repository.detail_repo

import com.example.movieapp.feature_movies.data.remote_data.details.DetailsService
import com.example.movieapp.feature_movies.data.remote_data.movie_tv_shows.MovieService
import com.example.movieapp.feature_movies.domain.model.details.movie.DetailMovie
import com.example.movieapp.feature_movies.domain.repository.details_repo.DetailsRepository
import com.example.movieapp.feature_movies.domain.utils.Resource
import com.example.movieapp.feature_movies.domain.utils.ResponseHandler
import javax.inject.Inject

class DetailsRepositoryImpl @Inject constructor(
    private val details: DetailsService,
    private val handleResponse: ResponseHandler
): DetailsRepository {

    override suspend fun getDetails(id: Int): Resource<DetailMovie> {
        return handleResponse.handleResponse {
            details.getSearch(id)
        }
    }

}