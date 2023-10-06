package ru.kurkin.task2;

public class LinkedList {
    private Node head;

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public int getData() {
            return data;
        }
    }

    public void insertAtHead(int value) {
        Node newNode = new Node(value);
        if (head == null) {//null учтено!)
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public int getHead() {
        return head.getData();
    }
}

