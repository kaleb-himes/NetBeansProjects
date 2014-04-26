/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphlab_v1.pkg0;

/**
 *
 * @author kaleb.himes
 */
public class Vertex {
    private String value;
    public boolean visited;

  Vertex(String b, boolean v){
        this.value = b;
        this.visited = v;
    }
  public String getNode(){
      return value;
  }
  public void setData(String s){
      value = s;
  }
  public void setVisited(boolean v){
      visited = v;
  }
  public boolean getVisited(){
      return visited;
  }
  public void printInfo(int e){
      System.out.println(value);
  }
}
