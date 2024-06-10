package laba2;

import java.util.Vector;
public class LibraryItemTest {
	public static void main(String[] args) {
		Vector<LibraryItem> libraryItems = new 	Vector<LibraryItem>();
		libraryItems.add(new Book("Jane Eyre" , "Charlotte Brontë", 1847 , Language.ENGLISH , "	Smith, Elder & Co." , 657 , "Gothic Bildungsroman Romance" ));
		libraryItems.add(new Book( "Война́ и мир", "Лев Николаевич Толстой" , 1873 , Language.RUSSIAN , "Русский вестник", 1300 , "роман-эпопея"));
		libraryItems.add(new Book( "Абай жолы", "Мұхтар Омарханұлы Әуезов" , 1956, Language.KAZAKH , "қазақ" , 1458 , "romance"));
	for(LibraryItem l : libraryItems) {
		
		String recomendation = l.toString();
		System.out.println(recomendation);
		 
		int cntPages = l.getDuration();
		l.getPublicationInformation();
		
		System.out.println(" number of pages is " + cntPages + " \n"); 
		

	}
}
}
