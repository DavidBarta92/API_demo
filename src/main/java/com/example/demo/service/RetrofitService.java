package com.example.demo.service;

import com.example.demo.model.Movie;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Service
public class RetrofitService implements MovieDbAPIService{

  public Retrofit build() {
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl("https://api.themoviedb.org/3/")
        .addConverterFactory(GsonConverterFactory.create())
        .build();
    return retrofit;
  }

  @Override
  public Call<Movie> getMovie(Long id, String api_key, String external_source) {
    return null;
  }
}
