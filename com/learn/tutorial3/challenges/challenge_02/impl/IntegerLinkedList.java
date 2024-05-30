package com.learn.tutorial3.challenges.challenge_02.impl;

import com.learn.tutorial3.challenges.challenge_02.pojo.IntegerNode;

import java.util.Objects;

public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void insertSorted(Integer value) {
        if(Objects.isNull(head) || value < head.getValue()) {
            addToFront(value);
        } else {
            IntegerNode prevNode = head;
            IntegerNode currentNode = prevNode.getNext();
            while (Objects.nonNull(currentNode) && currentNode.getValue() < value) {
                prevNode = prevNode.getNext();
                currentNode = currentNode.getNext();
            }
            IntegerNode newNode = new IntegerNode(value);
            prevNode.setNext(newNode);
            newNode.setNext(currentNode);
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
