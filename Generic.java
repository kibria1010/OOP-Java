package oopconcepts;

public class Generic {

    public static <T> void arrayPrint(T[] a) {
        for (T item : a) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Integer[] array1 = {0, 1, 2, 3};
        String[] array2 = {"Hello", "World"};
        arrayPrint(array1);
        arrayPrint(array2);

        Bucket<String> bucket1 = new Bucket<>();
        Bucket<Integer> bucket2 = new Bucket<>();

        bucket1.putInBucket("Hello World!");
        bucket2.putInBucket(12345);

        System.out.println(bucket1.fetchFromBucket());
        System.out.println(bucket2.fetchFromBucket());
    }
}

// Bucket.java
class Bucket<T> {

    private T item;

    public void putInBucket(T item) {
        this.item = item;
    }

    public T fetchFromBucket() {
        return item;
    }
}

class K<T> {
    T name;

    public K(T name) {
        this.name = name;
    }
    
    static class I<T>{
        int data;
        I<T> next;
    }
    
    public static <T> void arrayPrint(T[] a) {
        for (T item : a) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
    
}