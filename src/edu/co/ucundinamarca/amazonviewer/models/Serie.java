package edu.co.ucundinamarca.amazonviewer.models;

import java.util.ArrayList;

public class Serie extends Film{
	
	private int id;
	private byte seasonQuantity;
	private ArrayList<Chapter> chapters;
	
	public Serie(String title, String genre, byte seasonQuantity, short year) {
		super(title);
		setGenre(genre);
		setYear(year);
		this.seasonQuantity = seasonQuantity;
	}
	
	public int getId() {
		return id;
	}

	public short getSeasonQuantity() {
		return seasonQuantity;
	}

	public void setSeasonQuantity(byte seasonQuantity) {
		this.seasonQuantity = seasonQuantity;
	}

	public ArrayList<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(ArrayList<Chapter> chapters) {
		this.chapters = chapters;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return 	"Serie description" +
				"\nTitle:\t\t" + getTitle() +
				"\nGenre:\t\t" + getGenre() +
				"\nCreator:\t" + getCreator() +
				"\nSeason quantity:\t" + getSeasonQuantity() +
				"\nYear:\t\t" + getYear() +
				"\nChapters:\t";
	}
	
}
