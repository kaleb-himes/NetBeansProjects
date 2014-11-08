/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esof_hw3;

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
      System.out.println("Singleton Already exists in Registry.\n"
              + "" + name + " was not registered.\n");
      instance =  registry.get(name);
    } else {
        System.out.println("Singleton was not found,\n"
                + "Registering Singleton \"" + name + "\" now.");
        instance = registerSingleton(name, instance);
    }
    
    return instance;
  }
  
  private static UniqueSingleton registerSingleton(String name, UniqueSingleton s){
      s = new UniqueSingleton();
      s.name = name;
      registry.put(name, s);
      
      return s;
  }
  
  public String getName() {
    return name;
  }

  public String toString() {
    return "UniqueSingleton : " + getName();
  }
}
