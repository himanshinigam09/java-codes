public class MyThreadRun implements Runnable{
	private final String taskname;
	public MyThreadRun(String taskname){
		this.taskname=taskname; 
	}
	public void run(){
		try{
		System.out.println(taskname +" the thread is going to sleep ");
		Thread.sleep(2000);
		System.out.println(taskname +" done sleeping");
	}catch(InterruptedException e){System.out.println("interrupt occurred");
    }
}
	public static void main(String[] args) {
		MyThreadRun m1=new MyThreadRun("task1");
		Thread t1=new Thread(m1,"task1");
		MyThreadRun m2=new MyThreadRun("task2");
		Thread t2=new Thread(m2,"task2");
		System.out.println("created threads "+ t1 + t2);
		System.out.println("threads now started");
			t1.start(); 
			t2.start();
		System.out.println("ending main now");

	}
}