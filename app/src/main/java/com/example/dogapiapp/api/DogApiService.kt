package com.example.dogapiapp.api

import com.example.dogapiapp.DataClass.DogApiResponse
import com.example.dogapiapp.api.DogApiService
import retrofit2.Response
import retrofit2.http.GET


interface DogApiService {

    @GET("api/breeds/image/random")
    suspend fun getRandomDogImage():Response<DogApiResponse>
}