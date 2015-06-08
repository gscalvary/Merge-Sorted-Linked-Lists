package com.oliver;

public class LinkedListNode<T> {

    private T data;
    private LinkedListNode next;

    public LinkedListNode(T data) {

        this.data = data;
        next = null;
    }

    public LinkedListNode(T data, LinkedListNode<T> next) {

        this.data = data;
        this.next = next;
    }

    public T getData() {

        return data;
    }

    public void setData(T data) {

        this.data = data;
    }

    public LinkedListNode getNext() {

        return next;
    }

    public void setNext(LinkedListNode<T> next) {

        this.next = next;
    }
}
