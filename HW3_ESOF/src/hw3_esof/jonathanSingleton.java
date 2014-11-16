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
public class jonathanSingleton extends UniqueSingleton {
    
    public static jonathanSingleton instance = null;
    
    protected jonathanSingleton(){}
    
    public static jonathanSingleton getInstance(){
        if(instance == null){
            instance = new jonathanSingleton();
        }
        return instance;
    }
    
}
