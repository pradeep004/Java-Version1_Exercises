
public  abstract class Animal {
	private String name;
	
	public Animal(String name) {
		this.name= name;
	}
	
	public void getInfo() {
		System.out.println("The name :"+ this.getName());
	}
	
	public void sleep() {
		System.out.println("Animal sleep 8 hrs a day");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
