package edu.co.ucundinamarca.amazonviewer.models;

import java.util.Date;

public class Publication {

	private String title;
	private String isbn;
	private String editorial;
	private String[] authors;
	private Date editionDate;
	private short year;
	private short numberPages;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String[] getAuthors() {
		return authors;
	}

	public void setAuthors(String[] authors) {
		this.authors = authors;
	}

	public Date getEditionDate() {
		return editionDate;
	}

	public void setEditionDate(Date editionDate) {
		this.editionDate = editionDate;
	}

	public short getYear() {
		return year;
	}

	public void setYear(short year) {
		this.year = year;
	}

	public short getNumberPages() {
		return numberPages;
	}

	public void setNumberPages(short numberPages) {
		this.numberPages = numberPages;
	}

	public Publication(String title, String isbn, String editorial, String[] authors, Date editionDate, short year,
			short numberPages) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.editorial = editorial;
		this.authors = authors;
		this.editionDate = editionDate;
		this.year = year;
		this.numberPages = numberPages;
	}
	
}
