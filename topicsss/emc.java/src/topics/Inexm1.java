package topics;

interface Playable{
	void play();
}

class guitar implements Playable{

	@Override
	public void play() {
		System.out.println("play guitar");
		
	}
	
}
class piano implements Playable{

	@Override
	public void play() {
		System.out.println("play piaanooo");
		
	}
	
}

public class Inexm1 {
	public static void main(String[] args) {
		guitar g1= new guitar();
		piano p1=new piano();
		p1.play();
		g1.play();
		
		
		
		
	}

}
