package topics;
interface aa{
	void disp();
}

public class funinterfceeg {
	public static void main(String[] args) {
		aa obj1 = ()->{System.out.println("helooo");};
		obj1.disp();
	}
	
	

}
// to overcome this functional interface we have lambdaexpression
// we use lambda expression to word with functional interface.