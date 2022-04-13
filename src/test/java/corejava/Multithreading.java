package corejava;

/*Implements Runnable vs Extends Thread: Imp Runnable is better becoz we cannot extend other class if user usess Extnds-Thread. */

public class Multithreading extends Thread {
private int threadNumber;
public static void main(String[] args) {
	for(int i=0;i<=5;i++) {
		Multithreading mObj=new Multithreading(i); 
		mObj.start();
	}
	//mObj.run();
	//mObj.start();
}

public Multithreading(int threadNumber){
	this.threadNumber=threadNumber;
}

@Override
public void run() {
	for(int i=0;i<=5;i++) {
		try {
			System.out.println(i+" from thread number "+threadNumber);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}

//*************************************************************


/*
 * public class Multithreading implements Runnable { private int threadNumber;
 * public static void main(String[] args) { for(int i=0;i<=5;i++) {
 * Multithreading mObj=new Multithreading(i);
 * 
 * //only these 2 below line changes when using RUNNABLE instead of THREAD
 * Thread myThread=new Thread(mObj); myThread.start(); } //mObj.run();
 * //mObj.start(); }
 * 
 * public Multithreading(int threadNumber){ this.threadNumber=threadNumber; }
 * 
 * @Override public void run() { for(int i=0;i<=5;i++) { try {
 * System.out.println(i+" from thread number "+threadNumber);
 * Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
 * } } }
 */


