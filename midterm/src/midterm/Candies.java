package midterm;

public class Candies extends SweetProducer {
	private String taste;

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}
	
	public Candies(int sweetPercent, String sweetName, String companyName,String taste ) {
		super(sweetPercent, sweetName, companyName);
		this.taste=taste;
	}
	
	
	@Override
	public int produceSweet() {
		return sweetPercent;
	}
	@Override
	public String toString() {
		return super.toString() + " and it`s taste is " + taste; 
	}
	
}
