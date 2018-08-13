package com.zia.linkedlist.insertnode;

import java.util.Scanner;

public class Solution {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if (head == null) {
            head = newNode;
        }
        SinglyLinkedListNode temp = head;
        int  i = 1;
        while (i < position) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String length = scanner.next();
        if (length == null || length.isEmpty() || Integer.valueOf(length) == 0) {

        } else {
            SinglyLinkedList list = new SinglyLinkedList();
            for (int i = 0; i < Integer.valueOf(length); i++) {
                list.insertNode(scanner.nextInt());
            }
            insertNodeAtPosition(list.head, scanner.nextInt(), scanner.nextInt());
        }

        scanner.close();
    }
}
