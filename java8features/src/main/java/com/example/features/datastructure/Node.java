package com.example.features.datastructure;

public class Node {
  int value;
  Node next;

  public Node(int value, Node next){
    this.value= value;
    this.next=null;
  }

  @Override
  public String toString() {
    return "Node{" +
        "value=" + value +
        ", next=" + next +
        '}';
  }
}
