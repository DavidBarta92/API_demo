package com.example.demo.service;

import com.example.demo.model.Movie;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

@Service
public interface MovieDbAPIService {

  @GET("find/tt{id}?api_key=<api_key}&external_source={external_source}")
  Call<Movie> getMovie(@Path("id") Long id,
                       @Path("api_key")String api_key,
                       @Path("external_source")String external_source);
}
