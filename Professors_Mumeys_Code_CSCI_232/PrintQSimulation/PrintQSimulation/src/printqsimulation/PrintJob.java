/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package printqsimulation;

/**
 *
 * @author Brendan
 */
public class PrintJob {
    
    public int arrivalTime;
    public int finishTime;
    public int numPages;
    
    public PrintJob(int numPages) {
        this.numPages = numPages;
    }
}
