package pr33;

public class Lion extends Animal {
	private int age;
    private String location;

    public Lion(String name, String gender, int age, String location) {
        super(name, gender);
        this.location = location;
        this.age=age;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " the " + gender + " lion roars loudly  as rrrrrrrrrrr");
    }

    public void makeSound(int numberOfTimes) {
        System.out.println(name + " the " + gender + " lion roars " + numberOfTimes + " times as RRRRR");
    }

    public void sleep() {
        super.eat();
        super.makeSound();
        System.out.println(name + " the " + gender + " lion is sleeping in " + location + ".");
    }
}
