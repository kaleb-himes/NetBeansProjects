package avl_lab;

import java.util.*;

public class Driver
{
	public static void main(String [] args)
	{
	   AVLTree avl = new AVLTree();
	   Scanner scan = new Scanner(System.in);
	   int start = 0;
	   do{
	     System.out.println("Add what? (-1 to quit)");
             try{
	     start = scan.nextInt();
	     scan.nextLine();
             }catch(java.util.InputMismatchException ex){
                 System.out.println("Enter an integer next time please.");
                 System.exit(0);
             }
	     boolean ans = avl.add(start);
             PrintTree.printTree(avl);
             
	     if(!ans)
	        System.out.println(start + " not added");
	    } while(start != -1);
	    
	    System.out.println("Goodbye");
	}
}