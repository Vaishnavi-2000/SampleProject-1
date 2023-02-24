package in.ineuron.main;

class MyThread extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<9;i++)
		System.out.println("Child Thread");
	}
}

public class Test {
	
	public static void main(String[] args) {
		
		MyThread t1=new MyThread();
		t1.start();
		for(int i=0;i<9;i++)
		System.out.println("Main method");
		
		
	}

}
