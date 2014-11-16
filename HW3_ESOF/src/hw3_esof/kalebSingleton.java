/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3_esof;

/**
 *
 * @author khimes
 */
public class kalebSingleton extends UniqueSingleton {
    
    public static kalebSingleton instance = null;
    
    protected kalebSingleton(){}
    
    public static kalebSingleton getInstance(){
        if(instance == null){
            instance = new kalebSingleton();
        }
        return instance;
    }
    
}
