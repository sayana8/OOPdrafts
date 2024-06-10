package midterm;

public abstract class SweetProducer {
	int sweetPercent;
	String sweetName;
	String companyName;
	
	
	public SweetProducer(int sweetPercent, String sweetName, String companyName) {
		this.sweetPercent=sweetPercent;
		this.sweetName =sweetName;
		this.companyName = companyName;
		
	}
	
	
	public abstract int produceSweet();
		
	public String toString() {
		return "The candy " + sweetName + " has " +sweetPercent + " percent sugar and it is made by " + companyName;
	}
}
