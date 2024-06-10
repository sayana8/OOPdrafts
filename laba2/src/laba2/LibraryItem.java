package laba2;

public abstract  class LibraryItem {
	String title;
	String author;
	int publicationYear;
	Language language;
	String publicationCompany;
	
	public LibraryItem(String title, String author, int publicationYear, Language language, String publicationCompany) {
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
		this.language = language;
		this.publicationCompany = publicationCompany;
		
	}
	
	public String toString() {
		return title + " is incredible book written by " + author + " in " + publicationYear + ". I can highly recommend it !!!!";
		
	}
	
	abstract int getDuration();
	abstract void getPublicationInformation();
	
}
