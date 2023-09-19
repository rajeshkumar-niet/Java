// Code written by Rajesh Kumar

public class LRU_CODE {
    public static void main(String[] args) {
        LRUCache<Integer, String> lruCache = new LRUCache<>(3);
        
        lruCache.put(1, "One");
        lruCache.put(2, "Two");
        lruCache.put(3, "Three");
        lruCache.put(4, "Four"); 
        
        System.out.println(lruCache.get(1)); 
        
        System.out.println(lruCache.get(2));
         
        System.out.println(lruCache.get(3));
         
        System.out.println(lruCache.get(4));
        
    }
}
