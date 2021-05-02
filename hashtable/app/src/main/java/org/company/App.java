package org.company;

public class App {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.put(new HashNode(1, 50));
        hashTable.put(new HashNode(2, 10));
        hashTable.put(new HashNode(3, 7));
        hashTable.put(new HashNode(4, 9));
        hashTable.put(new HashNode(4, 10));
        hashTable.printHashTable();

        System.out.println(hashTable.get(5));
        System.out.println(hashTable.get(4));
    }
}
