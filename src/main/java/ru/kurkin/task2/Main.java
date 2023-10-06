package ru.kurkin.task2;

public class Main {
        public static void main(String[] args) {
            LinkedList list = new LinkedList();
            list.insertAtHead(3);
            list.insertAtHead(5);
            System.out.println(list.getHead());
        }
    }