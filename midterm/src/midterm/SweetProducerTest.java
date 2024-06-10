package midterm;

public class SweetProducerTest {
	public static void main(String[] args) {
		Candies candy1 = new Candies(60, "lala", "Nestle", "chocolate");
		Candies candy2 = new Candies(70, "sarah", "Danon", "cherry");
		
		
		int cnt = candy1.produceSweet();
		System.out.println(cnt);
		
		candy2.produceSweet();
		candy1.toString();
		candy2.toString();
	}
}

