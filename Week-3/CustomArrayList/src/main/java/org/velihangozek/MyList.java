package org.velihangozek;

import java.util.Arrays;

public class MyList<T> {
    private T[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * Constructs an empty list with default capacity.
     */
    public MyList() {
        this.elements = (T[]) new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        System.out.println("Number of elements in the list : " + list.size());
        System.out.println("Capacity of the list : " + list.getCapacity());
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Number of elements in the list : " + list.size());
        System.out.println("Capacity of the list : : " + list.getCapacity());
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(110);
        System.out.println("Number of elements in the list : " + list.size());
        System.out.println("Capacity of the list : " + list.getCapacity());

        System.out.println("\n---------------------------------------------------\n");

        MyList<Integer> secondList = new MyList<>();
        secondList.add(10);
        secondList.add(20);
        secondList.add(30);
        System.out.println("Value at index 2 : " + secondList.get(2));
        secondList.remove(2);
        secondList.add(40);
        secondList.set(0, 100);
        System.out.println("Value at index 2 : " + secondList.get(2));
        System.out.println(secondList.toString());

        System.out.println("\n---------------------------------------------------\n");

        MyList<Integer> thirdList = new MyList<>();
        System.out.println("List Status : " + (thirdList.isEmpty() ? "Empty" : "Full"));

        thirdList.add(10);
        thirdList.add(20);
        thirdList.add(30);
        thirdList.add(40);
        thirdList.add(20);
        thirdList.add(50);
        thirdList.add(60);
        thirdList.add(70);

        System.out.println("List Status : " + (thirdList.isEmpty() ? "Empty" : "Full"));

        // returns first index encountered
        System.out.println("Index : " + thirdList.indexOf(20));

        // returns -1 if cannot find
        System.out.println("Index :" + thirdList.indexOf(100));

        // returns last index encountered
        System.out.println("Index : " + thirdList.lastIndexOf(20));

        // returns list as an Object[] array.
        Object[] array = thirdList.toArray();
        System.out.println("First element of the Object array : " + array[0]);

        // Created a sublist of List type
        MyList<Integer> subList = thirdList.subList(0, 3);
        System.out.println(subList.toString());

        // Checked the value whether if it exists in the list
        System.out.println("20 value in the list : " + thirdList.contains(20));
        System.out.println("120 value in the list : " + thirdList.contains(120));

        // Clears the whole list and resets the list to its default capacity.
        thirdList.clear();
        System.out.println(thirdList.toString());
    }

    /**
     * Constructs an empty list with specified initial capacity.
     */
    public MyList(int capacity) {
        int cap = capacity > 0 ? capacity : DEFAULT_CAPACITY;
        this.elements = (T[]) new Object[cap];
        this.size = 0;
    }

    /** Returns the number of elements in the list. */
    public int size() {
        return this.size;
    }

    /** Returns the current capacity of the internal array. */
    public int getCapacity() {
        return this.elements.length;
    }

    /** Adds an element to the end of the list, resizing if necessary. */
    public void add(T data) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = data;
    }

    /** Returns the element at the specified index, or null if invalid. */
    public T get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return elements[index];
    }

    /** Removes the element at the specified index, shifts subsequent elements, and returns the removed value or null if invalid. */
    public T remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        T removed = elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[--size] = null;
        return removed;
    }

    /** Replaces the element at the specified index with the given data and returns the old value, or null if invalid. */
    public T set(int index, T data) {
        if (index < 0 || index >= size) {
            return null;
        }
        T old = elements[index];
        elements[index] = data;
        return old;
    }

    /** Returns true if the list is empty. */
    public boolean isEmpty() {
        return size == 0;
    }

    /** Returns the index of the first occurrence of data, or -1 if not found. */
    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (data == null ? elements[i] == null : data.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    /** Returns the index of the last occurrence of data, or -1 if not found. */
    public int lastIndexOf(T data) {
        for (int i = size - 1; i >= 0; i--) {
            if (data == null ? elements[i] == null : data.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    /** Returns true if the list contains the specified data. */
    public boolean contains(T data) {
        return indexOf(data) >= 0;
    }

    /** Clears all elements and resets capacity to default. */
    public void clear() {
        this.elements = (T[]) new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    /** Returns a sublist from start to finish (inclusive), or null if indices are invalid. */
    public MyList<T> subList(int start, int finish) {
        if (start < 0 || finish < start || finish >= size) {
            return null;
        }
        MyList<T> sub = new MyList<>(finish - start + 1);
        for (int i = start; i <= finish; i++) {
            sub.add(elements[i]);
        }
        return sub;
    }

    /** Returns an array containing all elements in the list. */
    public T[] toArray() {
        return Arrays.copyOf(elements, size, (Class<? extends T[]>) elements.getClass());
    }

    /** Overrides toString to list elements in [a,b,c] format. */
    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /** Doubles the capacity of the internal array. */
    private void resize() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }
}