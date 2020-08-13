package com.example.demo.service;

import com.example.demo.model.Movie;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

@Service
public interface MovieDbAPIService {

  @GET("")
  Call<Movie> getMovie(Long id, String apiKey);
}