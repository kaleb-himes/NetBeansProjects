/**
 * @Kaleb
 * OutLab 1
 * 26 Jan 2014
 */
package binarytree;

import java.util.Random;

public class Driver {

    public static void main(String[] args) {

        Random r = new Random();
        BinaryTree t = new BinaryTree();

        for (int i = 0; i < 500; i++) {
            t.insert(new TreeNode(r.nextInt(1000)));
        }
        PrintTree.printTree(t);

        int nRSValue = 100;
        int nRSValue2 = 200;
        int nRSValue3 = 300;
        int nRSValue4 = 400;
        int nRSValue5 = 500;
        System.out.println("searchvalue = " + nRSValue+", "+nRSValue2+", "+nRSValue3+", "+nRSValue4+", "+nRSValue5);
        try{
        System.out.println(t.nonRecursiveSearch(nRSValue).getData());
        }catch(java.lang.NullPointerException ex){
            
        }
        try{
        System.out.println(t.nonRecursiveSearch(nRSValue2).getData());
        }catch(java.lang.NullPointerException ex){
            
        }
        try{
        System.out.println(t.nonRecursiveSearch(nRSValue3).getData());
        }catch(java.lang.NullPointerException ex){
            
        }
        try{
        System.out.println(t.nonRecursiveSearch(nRSValue4).getData());
}catch(java.lang.NullPointerException ex){
            
        }
        try{
        System.out.println(t.nonRecursiveSearch(nRSValue5).getData());
}catch(java.lang.NullPointerException ex){
            
        }
        
        if(t.nonRecursiveSearch(nRSValue) == null){
        System.out.println(nRSValue+" was not found");
        }
        if(t.nonRecursiveSearch(nRSValue2) == null){
        System.out.println(nRSValue2+" was not found");
        }
        if(t.nonRecursiveSearch(nRSValue3) == null){
        System.out.println(nRSValue3+" was not found");
        }
        if(t.nonRecursiveSearch(nRSValue4) == null){
        System.out.println(nRSValue4+" was not found");
        }
        if(t.nonRecursiveSearch(nRSValue5) == null){
        System.out.println(nRSValue5+" was not found");
        }
    }
}
