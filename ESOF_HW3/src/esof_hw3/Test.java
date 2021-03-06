/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esof_hw3;

import java.util.Scanner;

/**
 *
 * @authors Kaleb, Jonathan
 */
public class Test {

    public static void main(String[] args) throws Exception {
        int number_2_create;
        
        number_2_create = getNumberToCreate();
        
        for (int i = 0; i < number_2_create; i++) {
            /* If the singleton does not already exist lookup will
             * register that singleton, otherwise will return existing
             */
            String newSingleton = getNameOfSingleton();
            UniqueSingleton.lookup(newSingleton);
            /* Let the user know the singleton was successfully registered
             * if not already existing, or already exists
             */
          
        }
    }
    public static int getNumberToCreate(){
        int x = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number of Singletons to register:");
        
        try {
        x = scan.nextInt();
        }catch(java.util.InputMismatchException ex) {
            System.out.println("Invalid input, do better next time.");
        };
        return x;
    }
    
    public static String getNameOfSingleton() {
        String name = "";
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a name for the new Singleton");
        
        try{
            name = scan.nextLine();
        }catch(java.util.InputMismatchException ex) {
            System.out.println("Invalid input, do better next time.");
        }
        return name;
    }
}
