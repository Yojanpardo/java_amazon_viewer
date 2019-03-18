package edu.co.ucundinamarca.amazonviewer.models;

public class Film {
	private String title;
	private String genre;
	private String creator;
	private short year;
	private boolean viewed;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public short getYear() {
		return year;
	}
	public void setYear(short year) {
		this.year = year;
	}
	public String isViewed() {
		
		if(viewed) {
			return "Yes";
		}else {
			return "Nop";
		}
	}
	public void setViewed(boolean viewed) {
		this.viewed = viewed;
	}
	public Film(String title) {
		super();
		this.title = title;
	}
	
}
