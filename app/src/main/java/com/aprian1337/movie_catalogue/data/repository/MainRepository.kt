package com.aprian1337.movie_catalogue.data.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.aprian1337.movie_catalogue.data.models.DetailMovieTv
import com.aprian1337.movie_catalogue.data.models.MovieTv
import com.aprian1337.movie_catalogue.data.network.response.*
import com.aprian1337.movie_catalogue.utils.EspressoIdlingResource
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainRepository constructor(private val networkDataSource: NetworkDataSource) :
    MainDataSource {

    val featuredMoviesList = MutableLiveData<List<MovieTv>>()
    val nowMoviesList = MutableLiveData<List<MovieTv>>()
    val featuredTvShowsList = MutableLiveData<List<MovieTv>>()
    val genreMovieList = MutableLiveData<List<GenresItem>>()
    val genresTvShowsList = MutableLiveData<List<GenresItem>>()

    companion object {
        @Volatile
        private var instance: MainRepository? = null

        fun getInstance(networkData: NetworkDataSource): MainRepository =
            instance ?: synchronized(this) {
                instance ?: MainRepository(networkData).apply {
                    instance = this
                }
            }
    }

    override fun getGenreTvShows(): LiveData<List<GenresItem>> {
        val genres = networkDataSource.getGenreTvShows()
        EspressoIdlingResource.increment()
        GlobalScope.launch {
            genres.enqueue(object : Callback<GenreResponse<GenresItem>> {
                override fun onResponse(
                    call: Call<GenreResponse<GenresItem>>,
                    response: Response<GenreResponse<GenresItem>>
                ) {
                    genresTvShowsList.postValue(response.body()?.genres!!)
                }

                override fun onFailure(
                    call: Call<GenreResponse<GenresItem>>,
                    t: Throwable
                ) {
                    Log.d("fail", t.message.toString())
                }
            })
        }
        EspressoIdlingResource.decrement()
        return genresTvShowsList
    }

    override fun getGenreMovies(): LiveData<List<GenresItem>> {
        val genres = networkDataSource.getGenreMovies()
        EspressoIdlingResource.increment()
        GlobalScope.launch {
            genres.enqueue(object : Callback<GenreResponse<GenresItem>> {
                override fun onResponse(
                    call: Call<GenreResponse<GenresItem>>,
                    response: Response<GenreResponse<GenresItem>>
                ) {
                    if (response.isSuccessful) {
                        genreMovieList.postValue(response.body()?.genres!!)
                    }
                }

                override fun onFailure(
                    call: Call<GenreResponse<GenresItem>>,
                    t: Throwable
                ) {
                    Log.d("fail", t.message.toString())
                }
            })
        }
        EspressoIdlingResource.decrement()
        return genreMovieList
    }

    override fun getFeaturedMovies(): LiveData<List<MovieTv>> {
        val featuredMoviesResponse = networkDataSource.getFeaturedMovies()
        EspressoIdlingResource.increment()
        GlobalScope.launch {
            featuredMoviesResponse.enqueue(object : Callback<ResponseDataMovies<MoviesResponse>> {
                override fun onResponse(
                    call: Call<ResponseDataMovies<MoviesResponse>>,
                    responseMovies: Response<ResponseDataMovies<MoviesResponse>>
                ) {
                    if (responseMovies.isSuccessful) {
                        val movieList = mutableListOf<MovieTv>()
                        for (datas in responseMovies.body()?.results!!) {
                            movieList.add(
                                MovieTv(
                                    datas.id,
                                    datas.title,
                                    datas.genreIds,
                                    datas.releaseDate,
                                    datas.overview,
                                    datas.posterPath,
                                    datas.voteAverage.toString(),
                                )
                            )
                        }
                        featuredMoviesList.postValue(movieList)
                    }
                }

                override fun onFailure(
                    call: Call<ResponseDataMovies<MoviesResponse>>,
                    t: Throwable
                ) {
                    Log.d("fail", t.message.toString())
                }
            })
        }
        EspressoIdlingResource.decrement()
        return featuredMoviesList
    }

    override fun getNowMovies(): LiveData<List<MovieTv>> {
        EspressoIdlingResource.increment()
        val nowMoviesResponse = networkDataSource.getNowMovies()
        runBlocking {
            nowMoviesResponse.enqueue(object : Callback<ResponseDataMovies<MoviesResponse>> {
                override fun onResponse(
                    call: Call<ResponseDataMovies<MoviesResponse>>,
                    responseMovies: Response<ResponseDataMovies<MoviesResponse>>
                ) {
                    if (responseMovies.isSuccessful) {
                        val movieList = mutableListOf<MovieTv>()
                        for (datas in responseMovies.body()?.results!!) {
                            movieList.add(
                                MovieTv(
                                    datas.id,
                                    datas.title,
                                    datas.genreIds,
                                    datas.releaseDate,
                                    datas.overview,
                                    datas.posterPath,
                                    datas.voteAverage.toString(),
                                )
                            )
                        }
                        nowMoviesList.postValue(movieList)
                    }
                }

                override fun onFailure(
                    call: Call<ResponseDataMovies<MoviesResponse>>,
                    t: Throwable
                ) {
                    Log.d("fail", t.message.toString())
                }
            })
        }
        EspressoIdlingResource.decrement()
        return nowMoviesList
    }

    override fun getFeaturedTvShows(): LiveData<List<MovieTv>> {
        EspressoIdlingResource.increment()
        val featuredTvShows = networkDataSource.getFeaturedTvShows()
        GlobalScope.launch {
            featuredTvShows.enqueue(object : Callback<ResponseDataTv<TvShowsResponse>> {
                override fun onResponse(
                    call: Call<ResponseDataTv<TvShowsResponse>>,
                    responseMovies: Response<ResponseDataTv<TvShowsResponse>>
                ) {
                    if (responseMovies.isSuccessful) {
                        val movieList = mutableListOf<MovieTv>()
                        for (datas in responseMovies.body()?.results!!) {
                            movieList.add(
                                MovieTv(
                                    datas.id,
                                    datas.name,
                                    datas.genreIds,
                                    datas.firstAirDate,
                                    datas.overview,
                                    datas.posterPath,
                                    datas.voteAverage.toString(),
                                )
                            )
                        }
                        featuredTvShowsList.postValue(movieList)
                    }
                }

                override fun onFailure(
                    call: Call<ResponseDataTv<TvShowsResponse>>,
                    t: Throwable
                ) {
                    Log.d("fail", t.message.toString())
                }
            })
        }
        EspressoIdlingResource.decrement()
        return featuredTvShowsList
    }

    override fun getOnAirTvShows(): LiveData<List<MovieTv>> {
        EspressoIdlingResource.increment()
        val onAirTvShows = networkDataSource.getOnAirTvShows()
        GlobalScope.launch {
            onAirTvShows.enqueue(object : Callback<ResponseDataTv<TvShowsResponse>> {
                override fun onResponse(
                    call: Call<ResponseDataTv<TvShowsResponse>>,
                    responseMovies: Response<ResponseDataTv<TvShowsResponse>>
                ) {
                    if (responseMovies.isSuccessful) {
                        val movieList = mutableListOf<MovieTv>()
                        for (datas in responseMovies.body()?.results!!) {

                            movieList.add(
                                MovieTv(
                                    datas.id,
                                    datas.name,
                                    datas.genreIds,
                                    datas.firstAirDate,
                                    datas.overview,
                                    datas.posterPath,
                                    datas.voteAverage.toString(),
                                )
                            )
                        }
                        nowMoviesList.postValue(movieList)
                    }
                }

                override fun onFailure(
                    call: Call<ResponseDataTv<TvShowsResponse>>,
                    t: Throwable
                ) {
                    Log.d("fail", t.message.toString())
                }
            })
        }
        EspressoIdlingResource.decrement()
        return nowMoviesList
    }

    override fun getDetailMovies(id: String): LiveData<DetailMovieTv> {
        EspressoIdlingResource.increment()
        val detailMoviesResponse = networkDataSource.getMoviesDetail(id)
        val detailMovies = MutableLiveData<DetailMovieTv>()
        detailMoviesResponse.enqueue(object : Callback<DetailMoviesResponse> {
            override fun onResponse(
                call: Call<DetailMoviesResponse>,
                response: Response<DetailMoviesResponse>
            ) {
                if (response.isSuccessful) {
                    with(response.body()) {
                        var stringGenre = ""
                        for (genre in this?.genres!!) {
                            stringGenre += if (genre.id != this.genres[genres.size - 1].id) {
                                genre.name + ", "
                            } else {
                                genre.name
                            }
                        }
                        detailMovies.postValue(
                            DetailMovieTv(
                                this.title,
                                stringGenre,
                                this.releaseDate,
                                this.overview,
                                this.posterPath,
                                this.voteAverage.toString()
                            )
                        )
                    }
                }
            }

            override fun onFailure(call: Call<DetailMoviesResponse>, t: Throwable) {
                Log.d("fail", t.message.toString())
            }
        })
        EspressoIdlingResource.decrement()
        return detailMovies
    }

    override fun getDetailTvShows(id: String): LiveData<DetailMovieTv> {
        EspressoIdlingResource.increment()
        val detailTvShowsResponse = networkDataSource.getTvShowsDetail(id)
        val detailTvShows = MutableLiveData<DetailMovieTv>()
        detailTvShowsResponse.enqueue(object : Callback<DetailTvShowsResponse> {
            override fun onResponse(
                call: Call<DetailTvShowsResponse>,
                response: Response<DetailTvShowsResponse>
            ) {
                if (response.isSuccessful) {
                    with(response.body()) {
                        var stringGenre = ""
                        for (genre in this?.genres!!) {
                            stringGenre += if (genre.id != this.genres[genres.size - 1].id) {
                                genre.name + ", "
                            } else {
                                genre.name
                            }
                        }
                        detailTvShows.postValue(
                            DetailMovieTv(
                                this.originalName,
                                stringGenre,
                                this.firstAirDate,
                                this.overview,
                                this.posterPath,
                                this.voteAverage.toString()
                            )
                        )
                    }
                }
            }

            override fun onFailure(call: Call<DetailTvShowsResponse>, t: Throwable) {
                Log.d("fail", t.message.toString())
            }
        })
        EspressoIdlingResource.decrement()
        return detailTvShows
    }
}