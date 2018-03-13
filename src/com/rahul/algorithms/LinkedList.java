package com.rahul.algorithms;

import java.util.Collection;
import java.util.Iterator;

/**
 * Created by mrahul on 07-Jan-18.
 */
public class LinkedList<E> implements Collection {

    private  Node<E> first;

    private Node<E> last;

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        Node<E> node = new Node<>(last, null, (E) o);
        if(last != null) {
            last.setNext(node);
        }
        if(first == null) {
            first = node;
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        Node<E> node = first;
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}

class Node<E> {

    private Node<E> prev;

    private Node<E> next;

    private E obj;

    public Node(Node<E> prev, Node<E> next, E obj) {
        this.prev = prev;
        this.next = next;
        this.obj = obj;
    }


    public Node<E> getPrev() {
        return prev;
    }

    public void setPrev(Node<E> prev) {
        this.prev = prev;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public E getObj() {
        return obj;
    }

    public void setObj(E obj) {
        this.obj = obj;
    }
}
