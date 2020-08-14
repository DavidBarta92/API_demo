package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MovieDTO {

  @Id
  private Integer id;
  private String originalTitle;
  private Integer budget;
  private String originalLanguage;
  private Double popularity;
  private String releaseDate;
  private Boolean adult;


  public MovieDTO() {
  }

  public MovieDTO(Movie movie) {
    this.id = movie.getId();
    this.originalTitle = movie.getOriginalTitle();
    this.budget = movie.getBudget();
    this.originalLanguage = movie.getOriginalLanguage();
    this.popularity = movie.getPopularity();
    this.releaseDate = movie.getReleaseDate();
    this.adult = movie.getAdult();
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getOriginalTitle() {
    return originalTitle;
  }

  public void setOriginalTitle(String originalTitle) {
    this.originalTitle = originalTitle;
  }

  public Integer getBudget() {
    return budget;
  }

  public void setBudget(Integer budget) {
    this.budget = budget;
  }

  public String getOriginalLanguage() {
    return originalLanguage;
  }

  public void setOriginalLanguage(String originalLanguage) {
    this.originalLanguage = originalLanguage;
  }

  public Double getPopularity() {
    return popularity;
  }

  public void setPopularity(Double popularity) {
    this.popularity = popularity;
  }

  public String getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }

  public Boolean getAdult() {
    return adult;
  }

  public void setAdult(Boolean adult) {
    this.adult = adult;
  }

}