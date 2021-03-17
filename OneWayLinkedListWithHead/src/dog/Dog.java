package dog;

public class Dog 
{
	private double age;
	private String name;
	private String breed;
	
	public Dog (double age, String name, String breed) {
		
		this.age = age;
		this.name = name;
		this.breed = breed;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return name + ", breed: " + breed + " , age: " + age;
	}
	
	
	
	

}
