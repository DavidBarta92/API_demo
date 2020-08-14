package com.example.demo.contoller;

import com.example.demo.model.ErrorMessage;
import com.example.demo.model.Movie;
import com.example.demo.service.MovieDbAPIService;
import com.example.demo.service.MovieService;
import com.example.demo.service.RetrofitService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.util.Date;

@org.springframework.web.bind.annotation.RestController
public class RestController {
 // private String apiKey = {API_KEY};
  private RetrofitService retrofitService;
  private MovieService movieService;
  private UserService userService;
  private MovieDbAPIService movieDbAPIService;

  @Autowired
  public RestController(RetrofitService retrofitService, MovieService movieService, UserService userSErvice) {
    this.retrofitService = retrofitService;
    this.movieService = movieService;
    this.userService = userService;
  }

  @GetMapping(value = "/movie/{id}")
  public ResponseEntity<?> find(@PathVariable Long id){
    Retrofit retrofit = retrofitService.build();
    movieDbAPIService = retrofit.create(MovieDbAPIService.class); //ebben nem vagyok biztos
    try {
      Call<Movie> getMovie = movieDbAPIService.getMovie(id, "082f50114a5eb60688e638e91e08df99", "imdb_id");
      Response<Movie> response = getMovie.execute();
      Movie movie = response.body(); // ennek van ertelme?
      movieService.saveMe(movie);
      return ResponseEntity.status(200).body(response.body());
    }
    catch(Exception e400){
      return ResponseEntity.status(400).body(new ErrorMessage("Error")); // ezt majd kidolgozom jobban
    }
  }
}
