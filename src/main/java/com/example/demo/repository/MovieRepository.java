package com.example.demo.repository;

import com.example.demo.model.Movie;
import com.example.demo.service.MovieService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {
}
