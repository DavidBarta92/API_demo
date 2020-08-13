package com.example.demo.service;

import org.springframework.stereotype.Service;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Service
public class RetrofitService {

  public Retrofit build() {
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl("https://api.themoviedb.org/3")
        .addConverterFactory(GsonConverterFactory.create())
        .build();
    return retrofit;
  }
}
