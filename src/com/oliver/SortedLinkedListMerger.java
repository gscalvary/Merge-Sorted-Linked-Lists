package com.oliver;

public class SortedLinkedListMerger<T extends Comparable<T>> {

    // O(1) space because no new linked list nodes are ever created.  O(n + m) time complexity if the two lists being
    // merged are of equal length.
    public LinkedList<T> merge(LinkedList<T> one, LinkedList<T> two) {

        LinkedListNode<T> nextOfOne = one.getHead();
        LinkedListNode<T> nextOfTwo = two.getHead();
        LinkedList<T> merged = new LinkedList<T>();

        while(true) {

            if(nextOfOne == null) {
                merged.setTail(nextOfTwo);
                break;
            } else if(nextOfTwo == null) {
                merged.setTail(nextOfOne);
                break;
            } else {
                T oneValue = nextOfOne.getData();
                T twoValue = nextOfTwo.getData();
                if(oneValue.compareTo(twoValue) < 0) {
                    merged.setTail(nextOfOne);
                    nextOfOne = nextOfOne.getNext();
                } else if(oneValue.compareTo(twoValue) == 0) {
                    merged.setTail(nextOfOne);
                    merged.setTail(nextOfTwo);
                    nextOfOne = nextOfOne.getNext();
                    nextOfTwo = nextOfTwo.getNext();
                } else {
                    merged.setTail(nextOfTwo);
                    nextOfTwo = nextOfTwo.getNext();
                }
            }
        }

        return merged;
    }
}
