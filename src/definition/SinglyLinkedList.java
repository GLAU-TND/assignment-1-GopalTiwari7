package definition;

import adt.ADT;

public class SinglyLinkedList<E> implements ADT<E> {
    private int size = 0;
    private Node<E> head = null;

    public int getSize() {
        return size;
    }
    //This method give the node according to index.
    public Node<E> getNode(int index) {
        Node<E> response = head;
        if (index < 0 && index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else {
            for (int i = 0; i < index && head != null; i++) {
                response = response.next;
            }
        }
        return response;
    }
    //This method add First node in list.
    private void addFirst(E item) {
        head = new Node<>(item, head);
        size++;
    }
    //This method add node after the given node.
    private void addAfter(Node<E> node, E item) {
        Node<E> node1 = new Node<>(item, node.next);
        node.next = node1;
        size++;
    }
    public void add(int index, E item) {
        if (index == 0) {
            addFirst(item);
        } else {
            addAfter(getNode(index - 1), item);
        }
    }


    @Override
    public void add(E item) {
        add(size, item);
    }
    //This method remove first Node from the list.
    private void removeFirst() {
        if (head == null) {
            throw new IndexOutOfBoundsException(Integer.toString(size));
        } else {
            head = head.next;
            size--;
        }
    }
    //This method remove Node after the given node.
    private void removeAfter(Node<E> node) {
        if (node.next == null) {
            throw new IndexOutOfBoundsException(Integer.toString(size));
        } else {
            node.next = node.next.getNext();
            size--;
        }
    }

    @Override
    public void remove() {

    }

    @Override
    public int search(E item) {
        return 0;
    }

    @Override
    public void sort() {

    }

    @Override
    public void print() {

    }

    //private Node class to provide the node.
    private static class Node<E> implements Comparable<E> {
        private E data;
        private Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }

        @Override
        public int compareTo(E e) {
            return 0;
        }
    }
}

