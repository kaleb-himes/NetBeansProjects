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
public class clemSingleton extends UniqueSingleton {
    
    public static clemSingleton instance = null;
    
    protected clemSingleton(){}
    
    public static clemSingleton getInstance(){
        if(instance == null){
            instance = new clemSingleton();
        }
        return instance;
    }
    
}
