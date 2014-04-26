/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package printqsimulation;

/**
 *
 * @author Brendan
 */
import java.util.Random;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;

public class PrintQSimulation {

    static double arrivalProbability = 0.1;
    static int updatePeriod = 10;
    static int numSecondsPerPage = 5;
    static int maxPages = 100;
    static int simulationTime = 36000;
    static int numPrinters = 3; // initial value
    static int threshold = 600; // 10 minutes
    
    static Random randomGenerator;

    /**
     * @param args the command line arguments
     */
    public static int doSimulation() {


        // print queue:
        LinkedList<PrintJob> printQ[] = new LinkedList[numPrinters];
        // list of jobs:
        ArrayList<PrintJob> jobList = new ArrayList<PrintJob>();


        for (int i = 0; i < numPrinters; i++) {
            printQ[i] = new LinkedList<PrintJob>();
        }

        // main simulation loop:
        int[] nextFreeTime = new int[numPrinters];
        for (int i = 0; i < numPrinters; i++) {
            nextFreeTime[i] = 0;
        }
        boolean done = false;
        int t = 0;
        while (!done) {
            // check to add new jobs to the queue:
            if (t % updatePeriod == 0 && t < simulationTime) {
                if (randomGenerator.nextDouble() < arrivalProbability) {
                    // create a new print job:
                    PrintJob newJob = new PrintJob(randomGenerator.nextInt(maxPages) + 1);
                    newJob.arrivalTime = t;
                    int randQ = randomGenerator.nextInt(numPrinters);
                    printQ[randQ].offer(newJob);
                    jobList.add(newJob);
                }
            }
            done = (t > simulationTime);
            for (int i = 0; i < numPrinters; i++) {
                if (t >= nextFreeTime[i] && !printQ[i].isEmpty()) {
                    // print the next job:
                    PrintJob nextJob = printQ[i].poll();
                    int printTime = nextJob.numPages * numSecondsPerPage;
                    nextJob.finishTime = t + printTime;
                    nextFreeTime[i] = t + printTime + 1;
                }
                // check to see if each printQ is empty
                done = done && printQ[i].isEmpty();
            }
            t++;
        }

        // simulation done, look at statistics:
        int longestWaitTime = 0;
        PrintJob longestJob = null;
        double averageWaitTime = 0.0;
        Iterator<PrintJob> jobIter = jobList.iterator();
        while (jobIter.hasNext()) {
            PrintJob nextJob = jobIter.next();
            int waitTime = nextJob.finishTime - nextJob.arrivalTime - nextJob.numPages * numSecondsPerPage;
            averageWaitTime += waitTime;
            if (waitTime > longestWaitTime) {
                longestWaitTime = waitTime;
                longestJob = nextJob;
            }
        }
        averageWaitTime /= jobList.size();
        System.out.println("\nNumber of printers: " + numPrinters);
        System.out.println("longest wait time = " + longestWaitTime);
        System.out.println("average wait time = " + averageWaitTime);

        return longestWaitTime;
    }

    public static void main(String[] args) {
        randomGenerator = new Random();

        numPrinters = 1;
        while (doSimulation() > threshold) {
            numPrinters++;
        }
        System.out.println("The system recommends you buy " + numPrinters + " printers.");
    }
}
