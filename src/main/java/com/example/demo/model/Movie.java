package com.example.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Movie {
  @Id
  private Long id;
  private boolean video;
  private int vote_coun;
  private double vote_average;
  private String title;
  private Date release_date; //ezzel lehet meg gond
  private String original_language;
  private String original_title;
  //private List<Long> genre_ids = Arrays.asList();
  private String backdrop_path;
  private boolean adult;
  private String overview;
  private String poster_path;
  private double popularity;

  public Movie(String title){
    this.title = title;
  }
}
