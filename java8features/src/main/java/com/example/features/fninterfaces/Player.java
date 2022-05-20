package com.example.features.fninterfaces;


public class Player {
  private int ranking;
  private String name;
  private int age;
  private int score;
  private String type;

  public Player(int ranking, String name, int age, int score, String type) {
    this.ranking = ranking;
    this.name = name;
    this.age = age;
    this.score = score;
    this.type = type;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getRanking() {
    return ranking;
  }

  public void setRanking(int ranking) {
    this.ranking = ranking;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "Player{" +
        "ranking=" + ranking +
        ", name='" + name + '\'' +
        ", age=" + age +
        ", score=" + score +
        ", type='" + type + '\'' +
        '}';
  }

  public void setAge(int age) {
    this.age = age;
  }


}
