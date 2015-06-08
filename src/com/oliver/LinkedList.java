package com.oliver;

public class LinkedList<T> {

    private LinkedListNode<T> head;
    private LinkedListNode<T> tail;

    public LinkedList() {

        head = tail = null;
    }

    public LinkedList(LinkedListNode<T> node) {

        if(node == null) throw new IllegalArgumentException("New node must not be null.");
        head = tail = node;
    }


    public void setHead(LinkedListNode<T> node) {

        if(node == null) throw new IllegalArgumentException("New node must not be null.");

        if(head == null) {
            head = tail = node;
        } else {
            node.setNext(head);
            head = node;
        }
    }

    public void setTail(LinkedListNode<T> node) {

        if(node == null) throw new IllegalArgumentException("New node must not be null.");

        if(head == null) {
            head = tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
    }

    public LinkedListNode<T> getHead() {

        return head;
    }

    public LinkedListNode<T> getTail() {

        return tail;
    }
}
