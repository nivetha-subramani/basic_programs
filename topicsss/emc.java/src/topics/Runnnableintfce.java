package topics;
// runnable interface does not having start function so create thread object to access the msg
// as well as create a implements runnable;
class ai implements Runnable{//extends Thread
	public void run()
	{
		System.out.println("Hiii im coming");
		
	}
}



public class Runnnableintfce {
	public static void main(String[] args) {
		
		ai obj=new ai();
		Thread t1 = new Thread(obj);// passes the obj into the thread
		t1.start();
		
	}

}
