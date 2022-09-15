package com.example.features.codes.linkedlists;

public class CustomLinkedList {
    Node head;

    public static void main(String[] args) {
        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList = addToLinkedList(customLinkedList, 12);
        customLinkedList = addToLinkedList(customLinkedList, 20);
        customLinkedList = addToLinkedList(customLinkedList, 19);
        customLinkedList = addToLinkedList(customLinkedList, 5);
        customLinkedList = addToLinkedList(customLinkedList, 3);

        iterateLinkedlist(customLinkedList);

        findMiddleInList(customLinkedList);

        deleteElement(customLinkedList, 5);

        iterateLinkedlist(customLinkedList);

    }

    private static void deleteElement(CustomLinkedList list, int in) {
        Node pointer = list.head;

        if (pointer != null && pointer.nextNode == null) {
            list.head = null;
        } else {
            while (pointer.nextNode != null) {
                if ((Integer) pointer.nextNode.data == in) {
                    if (pointer.nextNode.nextNode == null) {
                        pointer.nextNode = null;
                    } else {
                        pointer.nextNode = pointer.nextNode.nextNode;
                    }
                }

                pointer = pointer.nextNode;
            }
        }

    }

    private static void findMiddleInList(CustomLinkedList customLinkedList) {
        Node pointer = customLinkedList.head;
        Node midPointer = customLinkedList.head;
        int count = 0;
//        iterate pointer till full length
        while (pointer.nextNode != null){
            count = count +1;
            if(count%2==0){
                midPointer = midPointer.nextNode;
            }
            pointer = pointer.nextNode;
        }
        System.out.println("mid pointer" + midPointer.data);
    }

    private static void iterateLinkedlist(CustomLinkedList customLinkedList) {
        Node node = customLinkedList.head;
        while (node != null) {
            System.out.println(node.data);
            node = node.nextNode;

        }
    }


    private static CustomLinkedList addToLinkedList(CustomLinkedList customLinkedList,
                                                    Integer in) {
        Node current = customLinkedList.head;
        if (customLinkedList.head == null){
            Node node = new Node(in, null);
            customLinkedList.head = node;
        } else {
//            traverse to last node and insert
            Node last = customLinkedList.head;
            while (last.nextNode != null) {
                last = last.nextNode;
            }
            last.nextNode = new Node(in, null);
        }

        return customLinkedList;

    }

}
