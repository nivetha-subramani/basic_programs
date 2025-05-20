package topics;// excute a task at same time is called threads. we should use start()
// use public void run;
class A extends Thread{
	//void display()
	public void run()
	{
		for(int i=0;i<=10;i++) {
			System.out.println("where are you?");
			
		}
		
	}
}
class B extends Thread{
	
	//void display()
	public void run()
	{ 
		for(int i=0;i<=10;i++) {
			System.out.println("Im' here  you?");
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}			
		}	
	}
	
}
public class Thhreads {
	public static void main(String[] args) {
		A a1=new A();
		B b1=new B();
		a1.start();// it's running is unpredictable;
		b1.start(); //.display();// if u use a1.run here 1st task complete1st and then 2nd task will excetue.use start() to run at the same time;
	}

}

//set priority to run
// join method
