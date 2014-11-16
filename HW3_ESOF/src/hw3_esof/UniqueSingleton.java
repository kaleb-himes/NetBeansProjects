/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hw3_esof;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @authors Kaleb, Jonathan
 */
public class UniqueSingleton {

  private static final Map<String, UniqueSingleton> registry = new HashMap<>();
  private String name = null;
  private static UniqueSingleton instance;

  /**
   * Make sure to have private default constructor.
   * This avoids direct instantiation of class using 
   * new keyword/Class.newInstance() method
   */
  protected UniqueSingleton() {
  }
  /* With a hashmap we can get the instance by referencing the key,
   * this method is not needed by using this special struct, but clem
   * wanted it in here so it's here. */
  public static UniqueSingleton getInstance(){
      if (instance == null) {
          instance = new UniqueSingleton();
      }
          return instance;
  }
  
  public final static UniqueSingleton lookup(String name) {
    if (registry.containsKey(name)) {
      System.out.println("Looking up: "
              + "\"" + name + "\".\n");
      /* returns the instance of whatever is mapped to the key */
      System.out.println("Found, returning: \"" + UniqueSingleton.getInstance() + "\"\n");
    }else {
        System.out.println("");
    }
    
    return UniqueSingleton.getInstance();
  }
  
  public final static void registerSingleton(String name) {
        UniqueSingleton s = new UniqueSingleton();
        registry.put(name, s);
  }
}
