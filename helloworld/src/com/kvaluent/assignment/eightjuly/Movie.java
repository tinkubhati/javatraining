package com.kvaluent.assignment.eightjuly;

public class Movie {

public String movie_Name;
public String hero;
public String heroin;
public int year;



public Movie() {
}

public Movie(String movie_Name, String hero, String heroin, int year) {
		this.movie_Name = movie_Name;
		this.hero = hero;
		this.heroin = heroin;
		this.year = year;
	}

public String getMovie_Name() {
	return movie_Name;
}

public void setMovie_Name(String movie_Name) {
	this.movie_Name = movie_Name;
}

public String getHero() {
	return hero;
}

public void setHero(String hero) {
	this.hero = hero;
}

public String getHeroin() {
	return heroin;
}

public void setHeroin(String heroin) {
	this.heroin = heroin;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

@Override
public String toString() {
	return "Movie [movie_Name=" + movie_Name + ", hero=" + hero + ", heroin=" + heroin + ", year=" + year + "]";
}




}


