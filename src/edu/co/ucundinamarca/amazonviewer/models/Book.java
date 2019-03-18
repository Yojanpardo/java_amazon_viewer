package edu.co.ucundinamarca.amazonviewer.models;
import java.util.Date;

public class Book extends Publication implements IVisualizable{
	
	private int id, timeReaded;
	private String genre;
	private boolean read;
	
	public int getId() {
		return id;
	}
	
	public boolean getRead() {
		return read;
	}
	
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public int getTimeReaded() {
		return timeReaded;
	}

	public void setTimeReaded(int timeReaded) {
		this.timeReaded = timeReaded;
	}

	public Book(String title, String isbn, String editorial, String[] authors, Date editionDate, short year,
			short numberPages, String genre) {
		super(title, isbn, editorial, authors, editionDate, year, numberPages);
		this.genre = genre;
	}
	
	@Override
	public Date startToSee(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}

	@Override
	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		if(dateF.getSeconds() > dateI.getSeconds()) {
			setTimeReaded(dateF.getSeconds() - dateI.getSeconds()); 
		}else {
			setTimeReaded(0);
		}
	}
	
}
