package com.example.mvvmapp.data.rest

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path


interface RepoService{
    @GET("orgs/Google/repos")
    fun getRepositories(): Single<List<Repo>>

    @GET("repos/{owner}/{name}")
    fun getRepo(@Path("owner") owner: String, @Path("name") name: String): Single<Repo>
}