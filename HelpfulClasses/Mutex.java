import java.util.Random;
 
class Mutex extends Thread
{
    private static final Random rand = new Random();
 
    private int id;
 
    static final Object lock = new Object();
 
    public Mutex(int i)
    {
        id = i;
    }
 
    private void busy()
    {
        try
        {
            sleep(rand.nextInt(500));
        } catch (InterruptedException e)
        {
        }
    }
 
    private void non_critical()
    {
        System.out.println("Thread " + id + " is in a NON critical section");
        busy();
    }
 
    private  synchronized void critical()
    {
 
        System.out
                .println("Thread " + id + " is entering the critical section");
        busy();
        System.out.println("Thread " + id + " is leaving the critical section");
 
    }
 
    public void run()
    {
        for (int i = 0; i < 2; ++i)
        {
            critical();
        }
    }
 
    /* Processes */ 
 
    public static void main(String[] args)
    {
        int N = 2;
        Mutex[] p = new Mutex[N];
 
        /* Configure and start */
 
        for (int i = 0; i < N; i++)
        {
            p[i] = new Mutex(i);
            p[i].start();
        }
    }
}