package laba2;
 
public class Book extends LibraryItem {
	private int numberOfPages;
	private String genre;
	
	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public Book(String title, String author, int publicationYear, Language language, String publicationCompany, int numberOfPages, String genre) {
		super(title, author, publicationYear, language, publicationCompany);
		this.setNumberOfPages(numberOfPages);
		this.setGenre(genre);
		
	}
	
	public int getDuration() {
		return numberOfPages;
	}
	
	public void  getPublicationInformation() {
		System.out.println(  title + " that is written by " + author + " is published in " + publicationYear + " by "  + publicationCompany + " in genre of "  + genre)  ;
		
	}

	
	
}
