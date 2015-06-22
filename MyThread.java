public class MyThread extends Thread{
	MyThread (String s){
		super(s);
	}
	public void run(){
		try{
			System.out.println("Thread is going to sleep");
			Thread.sleep(5000);
			System.out.println("done sleeping");
		}catch(InterruptedException e){
			System.out.println("some interrupt occurred");
		}
	}
	public static void main(String[] args) {
		MyThread mt1=new MyThread("task1");
		MyThread mt2=new MyThread("task2");
		System.out.println("created threads "+ mt1 + mt2);
		mt1.start();
		mt2.start();
		System.out.println("threads now started");
		System.out.println("ending main now");

	}
}