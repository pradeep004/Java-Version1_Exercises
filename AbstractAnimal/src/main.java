
public class main {

	public static void main(String[] args) {
		
		Animal  luno = new Cat("luno","brown and white","meow");
		luno.sleep();
		
		((Cat)luno).Sound();
		
		Cat sch = (Cat)luno;
		luno.getInfo(); 
		
		System.out.println("------Platypus-------");
		Platypus p = new Platypus("Jimmy", "brown");
		p.getInfo();
		p.controlTemperature();
		p.sleep();
		
		Animal pack = new Platypus("pack", "game");
		((Platypus)pack).ducksPoperties();
		((Platypus)pack).controlTemperature();
		System.out.println(((Platypus)pack).bills);
		System.out.println(((Platypus)pack).teeth);
		
	}
	
	
	

}
