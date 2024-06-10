package laba1;

import java.util.Vector;

public class DragonLunch {
	private Vector<Person> kidnappedStudentes = new Vector<>();
	private int couples = 0;
	public void kidnap(Person p) {
		kidnappedStudentes.add(p);
	}
	
	public boolean willDragonEatOrNot() {
		int studentsNum = 0;
		for(Person person: kidnappedStudentes) {
			if(person.getGender() == Gender.BOY) {
				studentsNum++;
			}else {
				if(studentsNum == 0) {
					return true;
				}else {
					studentsNum--;
					couples++;
				}
			}
		}
		if(couples * 2 == kidnappedStudentes.size()) return false;
		else return true;
		
	}
	
	public String toString() {
		if (willDragonEatOrNot()) {
			return "None of the students survived";
		} else {
			return "All students survived!!! YOOOOOHOOOOOOOOOOOOOOO";
		}
	}
	
	public static void main(String[] args) {
		
		DragonLunch dragonlunch = new DragonLunch();
		Person Student4 = new Person(Gender.GIRL);
		Person Student1 = new Person(Gender.BOY);
		Person Student2 = new Person(Gender.BOY);
		Person Student3 = new Person(Gender.GIRL);
		
		dragonlunch.kidnap(Student4);
		dragonlunch.kidnap(Student1);
		dragonlunch.kidnap(Student2);
		dragonlunch.kidnap(Student3);
	
		
		System.out.print(dragonlunch.toString());
	}

}