package com.example.demo.service;

import com.example.demo.model.Movie;
import okhttp3.OkHttpClient;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Service
public class RetrofitService implements MovieDbAPIService{

  /*public Retrofit build() {
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl("https://api.themoviedb.org/3/")
        .addConverterFactory(GsonConverterFactory.create())
        .build();
    return retrofit;
  }*/

  public Retrofit buildRetrofit(String url, String type) {
    OkHttpClient.Builder client = new OkHttpClient.Builder();

    if(type.toLowerCase().equals("gson")) {
      return new Retrofit.Builder()
          .baseUrl(url)
          .addConverterFactory(GsonConverterFactory.create())
          .client(client.build())
          .build();
    }else if(type.toLowerCase().equals("string")) {
      return new Retrofit.Builder()
          .baseUrl(url)
          .client(client.build())
          .build();
    }

    return null;
  }


  @Override
  public Call<Movie> getMovie(Long id, String api_key) {
    return null;
  }
}
