package com.example.features.datastructure;

public class CustomLinkedList {
  private Node head;

  public CustomLinkedList(){
    this.head=null;
  }

  public void insertAtHead(int data) {
    Node newNode = new Node(data, null);
    if (head == null) {
      head = newNode;
    } else {
      var temp = newNode;
      temp.next=head;
      head=temp;

    }

  }

  public void print() {
    int count =0;
    Node temp = head;
    while (temp != null) {
      System.out.println(temp);
      temp= temp.next;
      count = count+1;
    }

    System.out.println("count:" + count);

  }

  public static void main(String[] args) {
    CustomLinkedList customLinkedList = new CustomLinkedList();
    customLinkedList.insertAtHead(2);
    customLinkedList.insertAtHead(6);
    customLinkedList.print();
  }
}
