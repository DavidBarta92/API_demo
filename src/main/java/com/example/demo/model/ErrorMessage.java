package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorMessage {
  private String error;

  public ErrorMessage(){
    this.error = "Unexpected error.";
  }

  public ErrorMessage(String error){
    this.error = error;
  }
}
