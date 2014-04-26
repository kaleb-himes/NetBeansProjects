/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hashlab;

import java.io.FileReader;

/**
 *
 * @author kaleb.himes
 */
public class Objects {
    private int number;
    private String value;

  Objects(int a, String b){
        this.number = a;
        this.value = b;
    }
  public int getInt(){
      return number;
  }
  public String getData(){
      return value;
  }
  public void setInt(int d){
      number = d;
  }
  public void setData(String s){
      value = s;
  }
  public void printInfo(int e){
      System.out.println(number + " " + value);
  }
}

