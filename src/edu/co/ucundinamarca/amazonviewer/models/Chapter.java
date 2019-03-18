package edu.co.ucundinamarca.amazonviewer.models;

public class Chapter extends Movie{
	private int id;
	private byte seasonNumber;
	
	public Chapter(String title, int duration, byte seasonNumber) {
		super(title, duration);
		this.setSeasonNumber(seasonNumber);
	}

	public byte getSeasonNumber() {
		return seasonNumber;
	}

	public void setSeasonNumber(byte seasonNumber) {
		this.seasonNumber = seasonNumber;
	}
	
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Chapter description" + 
				"\nTitle:\t\t" + getTitle() +
				"\nDuration:\t" + getDuration() + " min" +
				"\nYear:\t\t" + getYear() +
				"\nSeason:\t" + getSeasonNumber();
	}
}