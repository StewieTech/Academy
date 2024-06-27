public class MyThread extends Thread{

    int limitToStop;

    // Create a constructor to initialize the above instance variable
    // MyThread thread  = new MyThread() ;
    public MyThread(int limitToStop) {
        this.limitToStop = limitToStop;

    }

    // Override the run() method here.
    @Override
    public void run() {
        for (int i = 1; i < limitToStop; i+=2) {
            System.out.println(i);
            try  {
            Thread.sleep(100);
            } catch (InterruptedException e) {
                // throw new InterruptedException(e);
                e.printStackTrace() ; // maybe remove this line
                // found a nice article talking about .interrupt() placed it below
                Thread.currentThread().interrupt() ;
                System.out.println("Incorrect thread has been removed");

            }
        }
    }

}

// instead of creating a new throwable instance with throw new I was able to just catch the exception
// Looking at the Interupted Exception java docs I can see that it does not have a constructure that accepts an exception as an argument
/*
<https://docs.oracle.com/en/java/javase/17/docs//api/java.base/java/lang/InterruptedException.html>
<https://www.baeldung.com/java-interrupted-exception>
<https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.html>
*/
