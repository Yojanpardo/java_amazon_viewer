package edu.co.ucundinamarca.amazonviewer.models;

import java.util.Date;

public class Magazine extends Publication{
	
	private int id;
	
	public Magazine(String title, String isbn, String editorial, String[] authors, Date editionDate, short year,
			short numberPages) {
		super(title, isbn, editorial, authors, editionDate, year, numberPages);
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	
}
