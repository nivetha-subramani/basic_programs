package functionss;

public class swape {
public static void main(String[] args) {
	 int a=6;
	 int b=5;
	 
	 
	 swap(6,5);
	 System.out.println("afterswape a=: "+a + "b=: "+b);
	 
}

static void swap(int a,int b) {
	int temp=a;
	a=b;
	temp=b;
}

}
/*//swape code

	 int temp=a;
	 a=b;
	 b= temp;
	 System.out.println(a+" "+b  );*/