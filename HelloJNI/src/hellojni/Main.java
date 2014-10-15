/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellojni;

/**
 *
 * @author khimes
 */
public class Main {
   static {
      System.loadLibrary("hello"); // Load native library at runtime
                                   // hello.dll (Windows) or libhello.so (Unixes)
   }
 
   // Declare a native method sayHello() that receives nothing and returns void
   private native void sayHello();
 
   // Test Driver
   public static void main(String[] args) {
      new Main().sayHello();  // invoke the native method
   }
}