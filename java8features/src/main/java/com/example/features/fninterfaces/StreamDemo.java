package com.example.features.fninterfaces;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo {

  public static void main(String[] args) {

    Player player1 = new Player(1, "dhoni", 40, 109, "batsmen");
    Player player2 = new Player(2, "kohli", 40, 89, "batsmen");
    Player player3 = new Player(5, "raina", 36, 12, "allrounder");
    Player player4 = new Player(11, "bumra", 36, 23, "bowler");
    Player player5 = new Player(11, "rohit", 37, 44, "batsmen");
    Player player6 = new Player(15, "raidu", 41, 58, "batsmen");
    Player player7 = new Player(33, "zaheerkhan", 39, 27, "bowler");

    List<Player> list = Arrays.asList(player1,player2,player3,player4,player5,player6, player7);

    // total runs by all batsmen
    var totalscore = list.stream().map(v-> v.getScore())
        .reduce(0, (v,i) -> v+i );

    var totalscore2 = list.stream().mapToInt(v->v.getScore())
            .reduce((v,i)-> v+i);

    var totalscore3 = list.stream().mapToInt(v->v.getScore()).sum();

    System.out.println(totalscore);    System.out.println(totalscore3);

    System.out.println(totalscore2.isPresent()?totalscore2.getAsInt():0);

    // count of players average
    System.out.println("average scores");
    System.out.println(list.stream().mapToInt(v->v.getScore()).average());
    //todo other wasys

    // count of players who scored > 100
    System.out.println("players who scored >100");
    System.out.println(list.stream().filter(v->v.getScore()>100).collect(Collectors.toList()));
    System.out.println(list.stream().filter(v->v.getScore()>100).count());
    // distinct age of all players
    // by default 2 objs equals method is called************* imp interview questions
    System.out.println(list.stream().collect(Collectors.toMap(Player::getAge,
            Function.identity(), (p1,p2)->p2)).values());

    // 2nd best batsmen score
    System.out.println("2nd best batsmen");
    System.out.println(list.stream().sorted(Comparator.comparingInt(Player::getScore)).collect(Collectors.toList()));
    System.out.println(list.stream().sorted((p1,p2)->Integer.compare(p1.getScore(), p2.getScore())).collect(Collectors.toList()));
    System.out.println(list.stream().sorted(Comparator.comparingInt(Player::getScore)
            .reversed()).limit(2).skip(1).collect(Collectors.toList()));

    // max aged batsman
    System.out.println("max aged person");
    System.out.println(list.stream().sorted(Comparator.comparingInt(Player::getAge).reversed()).limit(1).collect(Collectors.toList()));

    // least score by batsmen
    System.out.println("least score by player");
    System.out.println(list.stream().sorted(Comparator.comparingInt(Player::getAge)).limit(1).collect(Collectors.toList()));

    // scores by batsmen only
    System.out.println("scores by batsmen only");
    System.out.println(list.stream().filter(v->v.getType().equalsIgnoreCase("batsmen")).collect(Collectors.toSet()));

    // sort ranking by batsmen

    // number of batsmen
    System.out.println(list.stream().filter(v->v.getType().equalsIgnoreCase("batsmen")).count());


    // sort batsmen by scores

    //top 3 scores of batsmen
    System.out.println("top 3 scores ");
    System.out.println(list.stream().sorted(Comparator.comparingInt(Player::getScore).reversed()).limit(3).collect(Collectors.toSet()));

    // least 3 scores  private int age;

    // 2nd set of program - grouping by / frequency/ tomap // counting
    List<Integer> integerList = Arrays.asList(2,5,2,7,12,12,5,4,2,8);
    // count the duplicate numbers
    var countmap = integerList.stream().collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));
    System.out.println(countmap);

    // function.identity returns same value
    countmap.entrySet().stream().filter(v->v.getValue()>1).forEach(System.out::println);
    var samp = integerList.stream().collect(Collectors.toMap(Function.identity(), Function.identity(), (i,v)->i));
    System.out.println(samp);

    var statistisc = integerList.stream().mapToInt(v->v).summaryStatistics();
    statistisc.getAverage();
    statistisc.getCount();

//    count by age
    Map map_count = list.stream().collect(Collectors
            .groupingBy(Player::getAge, Collectors.counting()));

    map_count.forEach((k,v)-> System.out.println("age:"+k + " count:"+v));

    map_count.entrySet().stream().forEach(v-> System.out.println(v));

    map_count.values().stream().forEach(v-> System.out.println(v));

  }
}
