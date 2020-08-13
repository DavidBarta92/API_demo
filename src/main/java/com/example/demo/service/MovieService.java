package com.example.demo.service;

import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepository;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.converter.gson.GsonConverterFactory;

@Service
@Getter
@Setter
@NoArgsConstructor
public class MovieService {
  @Autowired
  private MovieRepository movieRepository;

  public MovieService(MovieRepository movieRepository) {
    this.movieRepository = movieRepository;
  }

  public void save(Movie movie) {
    this.movieRepository.save(movie);
  }
}