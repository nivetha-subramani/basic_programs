package emc.java;
// this key word  represent the current object in the method
//main use of thiskeywrd... used to eliminate the confusion between class &parameter with same name;
public class thissskw {
	String mynickname=null;
	thissskw()
	{
		System.out.println("hiiihlo");
	}
	
	void setname(String a)
	{
		this.mynickname=a;
	}
	public static void main(String[] args) {
		thissskw obj=new thissskw();
		obj.setname("nivii");
		System.out.println(obj.mynickname);

	}

}
