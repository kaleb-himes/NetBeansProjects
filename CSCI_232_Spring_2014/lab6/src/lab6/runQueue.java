/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author kaleb.himes
 */
public class runQueue {
    public static void main(String[] args) {
        Queue Q1 = new Queue();
        Queue Q2 = new Queue();
        Queue Q3 = new Queue();

        for(int minutes = 0; minutes < 5; minutes++){
            int randomQueue = (int) (Math.random()*3) + 1;
            int newParty = (int) (Math.random()*4) + 1;
            int t1 = Q1.total();
            System.out.print("Queue 1 has "+t1+" people in it.\n");
            int t2 = Q2.total();
            System.out.print("Queue 2 has "+t2+" people in it.\n");
            int t3 = Q3.total();
            System.out.print("Queue 3 has "+t3+" people in it.\n");
                if(t1 == 0 && t2 == 0 && t3 == 0){
                    Q1.push(newParty);
                    t1 += newParty;
                    System.out.println("A party of " + newParty + " just entered Queue 1.\n");
                    
                }
                if(t1 < t2 && t1 < t3){
                    Q1.push(newParty);
                    t1 += newParty;
                    System.out.println("A party of " + newParty + " just entered Queue 1.\n");
                    
                }
                if(t2 < t1 && t2 < t3){
                    Q2.push(newParty);
                    t2 += newParty;
                    System.out.println("A party of " + newParty + " just entered Queue 2.\n");
                    
                }
                if(t3 < t1 && t3 < t2){
                    Q3.push(newParty);
                    t3 += newParty;
                    System.out.println("A party of " + newParty + " just entered Queue 3.\n");
                    
                }
                if(minutes%2 == 0){
                    
                        if(randomQueue == 1 && t1 == 0){
                               System.out.println("No parties cleared security at this time");
                           }
                        else if(randomQueue == 1) {
                                System.out.println("A party of size " + Q1.pop() +" just left Queue 1");
                                t1 = t1 - Q1.pop();
                            }
                            
                        
                        if(randomQueue == 2 && t2 == 0){
                               System.out.println("No parties cleared security at this time");
                           }
                        else if(randomQueue == 2) {
                                System.out.println("A party of size " + Q2.pop() +" just left Queue 2");
                                t2 -= Q2.pop();
                            }
                        if(randomQueue == 3 && t3 == 0){
                               System.out.println("No parties cleared security at this time");
                           }
                        else if(randomQueue == 3) {
                                System.out.println("A party of size " + Q3.pop() +" just left Queue 3");
                                t3 -= Q3.pop();
                            }   
                }
            }
        }
 }

