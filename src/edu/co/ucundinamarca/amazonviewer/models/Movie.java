package edu.co.ucundinamarca.amazonviewer.models;

import java.util.ArrayList;
import java.util.Date;

public class Movie extends Film implements IVisualizable{
	
	private int id;
	private int duration;
	private int timeViewed;

	public Movie(String title, int duration) {
		super(title);
		this.duration = duration;
	}

	public int getId() {
		return id;
	}

	public int getTimeViewed() {
		return timeViewed;
	}

	public void setTimeViewed(int timeViewed) {
		this.timeViewed = timeViewed;
	}
	
	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "Movie description" +
				"\n Title:\t\t" + getTitle() + 
				"\n Genre:\t\t" + getGenre() +
				"\n Creator:\t" + getCreator() +
				"\n Duration:\t" + getDuration() + " min" +
				"\n Year:\t\t" + getYear();
	}

	@Override
	public Date startToSee(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}

	@Override
	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		if(dateF.getTime() > dateI.getTime()) {
			setTimeViewed((int)dateF.getTime() - (int)dateI.getTime()); 
		}else {
			setTimeViewed(0);
		}
	}
	
	public static ArrayList<Movie> makeMoviesList(){
		ArrayList<Movie> movies = new ArrayList<Movie>();
		for (int i = 0; i < 5; i++) {
			movies.add(new Movie("Movie" + i, 135+i));
		}
		return movies;
	}
}
