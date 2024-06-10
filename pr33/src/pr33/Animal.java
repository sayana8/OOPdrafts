package pr33;

public abstract class Animal {
	protected String name;
	protected String gender;

public Animal(String name, String gender) {
	this.name=name;
	this.gender=gender;
}

public void eat() {
	System.out.println(name + " the  " + gender + " is eating its victim ");
	
}

public void makeSound() {
	System.out.println(name + " the  " + gender + "eating its victim makes sound  as every typical animal" );
	
}
}