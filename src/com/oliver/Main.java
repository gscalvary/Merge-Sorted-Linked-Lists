package com.oliver;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> one = new LinkedList<Integer>(new LinkedListNode<Integer>(2));
        one.setTail(new LinkedListNode<Integer>(5));
        one.setTail(new LinkedListNode<Integer>(7));

        LinkedList<Integer> two = new LinkedList<Integer>();
        two.setTail(new LinkedListNode<Integer>(3));
        two.setTail(new LinkedListNode<Integer>(11));

        LinkedListNode<Integer> oneNode = one.getHead();
        System.out.println("First list: ");
        for(int i = 0; oneNode != null; i++) {
            System.out.println(i + " = " + oneNode.getData());
            oneNode = oneNode.getNext();
        }

        LinkedListNode<Integer> twoNode = two.getHead();
        System.out.println("Second list: ");
        for(int i = 0; twoNode != null; i++) {
            System.out.println(i + " = " + twoNode.getData());
            twoNode = twoNode.getNext();
        }

        SortedLinkedListMerger<Integer> merger = new SortedLinkedListMerger<Integer>();
        LinkedList<Integer> merged = merger.merge(one, two);

        LinkedListNode<Integer> mergeNode = merged.getHead();
        System.out.println("Merged list: ");
        for(int i = 0; mergeNode != null; i++) {
            System.out.println(i + " = " + mergeNode.getData());
            mergeNode = mergeNode.getNext();
        }
    }
}