package com.trimble.bootbasics.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

import java.io.Serializable;


@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class User implements Serializable {
  @Id
  @GeneratedValue
  private Integer id;
  private String name;
  private String age;
}
