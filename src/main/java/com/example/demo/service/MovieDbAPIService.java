package com.example.demo.service;

import com.example.demo.model.Movie;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Service
public interface MovieDbAPIService {

  //@GET("find/tt{id}?api_key={api_key}&external_source={external_source}")
  @GET("/movie/{id}")
  Call<Movie> getMovie(@Path("id") Long id,
                       @Query("api_key") String api_key);
}
