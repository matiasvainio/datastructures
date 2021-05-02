package org.company;

public class App {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.put(new HashNode(1, 1));
        hashTable.put(new HashNode(4, 2));
        hashTable.put(new HashNode(5, 3));
        hashTable.put(new HashNode(10, 4));
        hashTable.put(new HashNode(10, 5));
        hashTable.printHashTable();

        System.out.println(hashTable.get(5));
        System.out.println(hashTable.get(4));
    }
}
