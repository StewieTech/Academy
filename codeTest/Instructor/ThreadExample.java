

class MyThread extends Thread{
  MyThread(String name) {
    super(name);
  }

  @Override
  public void run() {
    System.out.println("Running: " this.getName() + " - " + this.getState() );

    for (int i = 0 ; i < 10; i++) {
      System.out.println("Running: " + this.getName() + " - " + this.getState()) ;

      try {
        Thread.sleep(400);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
      System.out.println("Running: " + this.getName() + " - " + this.getState()) ;
  }
}

public class ThreadExample {
  public static void main(String[] args) {

      System.out.println("Running: " + this.getName() + " - " + this.getState()) ;
      MyThread t1 = new MyThread("T1");

      t1.start();
  }

}
