import java.util.*;

public class HashMap {
  
  private int hsize;
  private LinkedList[] buckets;
  
  public HashMap(int hsize) {
    
    buckets = new LinkedList[hsize];
    for (int i = 0; i < hsize ; i++) {
      buckets[i] = new LinkedList();
      
    } 
    this.hsize = hsize;
    
  }
  
  public int hashing(int key) {
    int hash = hashing(key);
    if(hash < 0) {
      hash += hsize;
    }
    return hash;
  }
  
  public void insertHash(int key) {
    int hash = hashing(key);
    buckets[hash].insert(key);
  }
  
  public void deleteHash(int key) {
    
    int hash = hashing(key);
    buckets[hash].delete(key);
  }
  
  public void displayHashTable() {
    for(int i = 0; i < hsize; i++) {
     System.out.println("Bucket %d :", i);
     System.out.println(buckets[i].display());
    }
  }
  
  public static class LinkedList {
    
    private Node first;
    
    public LinkedList() {
      first = null;
    }
    
    public void insert(int key) {
      
      if(isEmpty()) {
        
        first = new Node(key);
        return;
      }
      Node temp = findEnd(first);
      temp.setNext(new Node(key));
    }
    
    private Node findEnd(Node n) {
      
      if(n.getNext() == null) {
        
        return n;
      } else {
        
        return findEnd(n.getNext());
      }
    }
    
    public Node findKey(int key) {
      
      if(!isEmpty()) {
        
        return findKey(first, key);
        
      } else {
        
        System.out.println("List is empty");
import java.util.*;

public class HashMap {
  
  private int hsize;
  private LinkedList[] buckets;
  
  public HashMap(int hsize) {
    
    buckets = new LinkedList[hsize];
    for (int i = 0; i < hsize ; i++) {
      buckets[i] = new LinkedList();
      
    } 
    this.hsize = hsize;
    
  }
  
  public int hashing(int key) {
    int hash = hashing(key);
    if(hash < 0) {
      hash += hsize;
    }
    return hash;
  }
  
  public void insertHash(int key) {
    int hash = hashing(key);
    buckets[hash].insert(key);
  }
  
  public void deleteHash(int key) {
    
    int hash = hashing(key);
    buckets[hash].delete(key);
  }
  
  public void displayHashTable() {
    for(int i = 0; i < hsize; i++) {
     System.out.println("Bucket %d :", i);
     System.out.println(buckets[i].display());
    }
  }
  
  public static class LinkedList {
    
    private Node first;
    
    public LinkedList() {
      first = null;
    }
    
    public void insert(int key) {
      
      if(isEmpty()) {
        
        first = new Node(key);
        return;
      }
      Node temp = findEnd(first);
      temp.setNext(new Node(key));
    }
    
    private Node findEnd(Node n) {
      
      if(n.getNext() == null) {
        
        return n;
      } else {
        
        return findEnd(n.getNext());
      }
    }
    
    public Node findKey(int key) {
      
      if(!isEmpty()) {
        
        return findKey(first, key);
        
      } else {
        
        System.out.println("List is empty");
        return null;
      }
    }
    
    public Node findKey(int key) {
      
      if(!isEmpty()) {
        
        return findKey(first, key);
        
      } else {
        
        System.out.println("List is empty");
        return null;
      }
    }
    /**
     * 
     **/
     public void delete(int key) {
       
