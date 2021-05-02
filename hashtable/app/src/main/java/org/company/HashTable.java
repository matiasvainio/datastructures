package org.company;

import java.util.Arrays;

public class HashTable {
    private final HashNode[] hashtable;

    public HashTable() {
        hashtable = new HashNode[10];
    }

    public void put(HashNode node) {
        System.out.println("put: " + node);
        int hashedKey = hashKey(node.getKey());
        if (occupied(hashedKey)) {
            int stopIndex = hashedKey;
            if (hashedKey == hashtable.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }

            while (occupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }

        if (!occupied(hashedKey)) {
            node.setKey(hashedKey);
            hashtable[hashedKey] = node;
        }
    }

    public HashNode get(int key) {
        System.out.println("get key: " + key);
        int hashedKey = hashKey(key);
        return hashtable[hashedKey];
    }

    private int hashKey(int key) {
        return key % hashtable.length;
    }

    private boolean occupied(int index) {
        return hashtable[index] != null;
    }

    public void printHashTable() {
        System.out.println(Arrays.toString(hashtable));
    }
}
