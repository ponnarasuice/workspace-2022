package com.example.features.fninterfaces;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

  public static void main(String[] args) {

    Player player1 = new Player(1, "dhoni", 40, 109, "batsmen");
    Player player2 = new Player(2, "kohli", 40, 89, "batsmen");
    Player player3 = new Player(5, "raina", 36, 12, "allrounder");
    Player player4 = new Player(11, "bumra", 36, 23, "bowler");
    Player player5 = new Player(11, "rohit", 37, 44, "batsmen");
    Player player6 = new Player(15, "raidu", 41, 58, "batsmen");

    List<Player> players = Arrays.asList(player1,player2,player3,player4,player5,player6);

    List<String> sampleList = Arrays.asList("bird", "apple", "zebra", "cat");

    //sort primitive values
    Collections.sort(sampleList);
    System.out.println(sampleList);

    // sort objects
    // need to implement comparotor or comparable in order to sort objects
    // if equal -0, gt 1 , lt -1
    Comparator<Player> comparatorbyAge = (Player p1, Player p2) -> Integer.compare(p1.getAge(), p2.getAge());
    Collections.sort(players, comparatorbyAge);
    players.sort(comparatorbyAge);
    players.stream().forEach(v-> System.out.println(v.getName()+":"+v.getAge()));

    System.out.println(players);

    Comparator<Player> comparatorReversed = comparatorbyAge.reversed();

    players.sort(comparatorReversed);
    System.out.println(players);

    Comparator<Player> comparatorBYrank = Comparator.comparingInt(Player::getRanking);

    players.sort(comparatorBYrank);

    System.out.println(players);

    var list = Arrays.asList("mat", "apple");
    Comparator alsort = Comparator.naturalOrder();
    Comparator stsort = (s1, s2 ) -> {
      if (s1.equals(s2)){
        return 0;
      }
      return 1;
    };

    list.sort(alsort);

  }
}
