
public class Charecter {
	String name ;
	String clothing;
	String background;
	int speed ;
	String Hair ;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	Charecter(String name, String clothing, String Hair){
		this.name = name;
		this.clothing= clothing;
		this.Hair= Hair;
			
	}

	Charecter (String name, int speed, String background){
		this.name=name;
		this.speed=speed;
		this.background =background;
	}
	Charecter(){	
	}
	
	public void printINfo() {
		System.out.println("name :"+ this.name + ",Speed :"+this.speed + ",BackGround :"+this.background);
	}
	
	
	

}
