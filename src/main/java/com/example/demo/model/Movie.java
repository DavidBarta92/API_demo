package com.example.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.nio.file.Path;
import java.sql.Date;
import java.util.Arrays;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Movie {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private boolean video;
  private int vote_coun;
  private double vote_average;
  private String title;
  private Date release_date; //ezzel lehet meg gond
  private String original_language;
  private String original_title;
  //private List<Long> genre_ids = Arrays.asList();
  //private Path backdrop_path;
  private boolean adult;
  private String overview;
  //private Path poster_path;
  private double popularity;

  public Movie(String title){
    this.title = title;
  }
}
