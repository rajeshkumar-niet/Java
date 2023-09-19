// Code written by Rajesh Kumar

import java.util.HashMap;

public class Hashing {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("apple", 5);
        hashMap.put("banana", 10);
        hashMap.put("orange", 7);

        int value = hashMap.get("banana");
        System.out.println("Value of 'banana': " + value);
        
        boolean containsKey = hashMap.containsKey("apple");
        System.out.println("Contains key 'apple': " + containsKey);

        hashMap.remove("orange");

        for (String key : hashMap.keySet()) {
            int val = hashMap.get(key);
            System.out.println("Key: " + key + ", Value: " + val);
        }
    }
}
