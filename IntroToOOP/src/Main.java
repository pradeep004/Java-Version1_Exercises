
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Charecter c = new Charecter();
		
		Charecter jett = new Charecter("Jett",12,"Duelist");
		Charecter fade = new Charecter("Fade","Brown","Black");
		Charecter raze = new Charecter("Raze", 15, "Duelist");
		Charecter sage = new Charecter("sage", 7, "Sentinal");
		System.out.println(fade.Hair);
		raze.printINfo();
		fade.printINfo();
		
		while(raze.getSpeed()>0) {
			raze.setSpeed(raze.getSpeed()-10);
			raze.printINfo();
			break;
		}
	}

}

