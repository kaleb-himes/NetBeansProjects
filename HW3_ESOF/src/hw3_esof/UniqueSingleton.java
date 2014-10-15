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

  private static Map<String, UniqueSingleton> registry = new HashMap<>();
  private String name = null;

  /**
   * Make sure to have private default constructor.
   * This avoids direct instantiation of class using 
   * new keyword/Class.newInstance() method
   */
  private UniqueSingleton() {
  }
  
  public static synchronized UniqueSingleton lookup(String name) {
    
    UniqueSingleton instance = null;
    
    if (registry.containsKey(name)) {
      System.out.println("Looking up: "
              + "\"" + name + "\".\n");
      instance =  registry.get(name);
      System.out.println("Found, returning: \"" + instance + "\"\n");
    } else {
        System.out.println("\n");
    }
    
    return instance;
  }
  
  public static void registerSingleton(String name){
      if (UniqueSingleton.lookup(name) == null){
        UniqueSingleton s = new UniqueSingleton();
        s.name = name;
        registry.put(name, s);
      }
      else {
          System.out.println("Singleton already exists, \"" + name + "\" "
                  + "was not registered.");
      }
  }
  
  public String getName() {
    return name;
  }

  public String toString() {
    return "UniqueSingleton : " + getName();
  }
}
