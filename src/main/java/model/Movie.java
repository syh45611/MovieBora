package model;

import java.sql.Date;

public class Movie 
{
	private int movieNo;
	private String movieName;
	private String movieDirector;
	private String movieActor1;
	private String movieActor2;
	private Date movieDate;
	private String movieGenre;
	private int movieGenreNo;
	private String movieStory;
	private String movieDel;
	private double score;

	public int getMovieNo() 
	{
		return movieNo;
	}
	public void setMovieNo(int movieNo) 
	{
		this.movieNo = movieNo;
	}
	public String getMovieName() 
	{
		return movieName;
	}
	public void setMovieName(String movieName) 
	{
		this.movieName = movieName;
	}
	public String getMovieDirector() 
	{
		return movieDirector;
	}
	public void setMovieDirector(String movieDirector) 
	{
		this.movieDirector = movieDirector;
	}
	public String getMovieActor1() 
	{
		return movieActor1;
	}
	public void setMovieActor1(String movieActor1) 
	{
		this.movieActor1 = movieActor1;
	}
	public String getMovieActor2() 
	{
		return movieActor2;
	}
	public Date getMovieDate() 
	{
		return movieDate;
	}
	public void setMovieDate(Date movieDate) 
	{
		this.movieDate = movieDate;
	}
	public void setMovieActor2(String movieActor2) 
	{
		this.movieActor2 = movieActor2;
	}
	public String getMovieGenre() 
	{
		return movieGenre;
	}
	public void setMovieGenre(String movieGenre) 
	{
		this.movieGenre = movieGenre;
	}
	public int getMovieGenreNo() 
	{
		return movieGenreNo;
	}
	public void setMovieGenreNo(int movieGenreNo) 
	{
		this.movieGenreNo = movieGenreNo;
	}
	public String getMovieStory() 
	{
		return movieStory;
	}
	public void setMovieStory(String movieStory) 
	{
		this.movieStory = movieStory;
	}
	public String getMovieDel() 
	{
		return movieDel;
	}
	public void setMovieDel(String movieDel) 
	{
		this.movieDel = movieDel;
	}
	public double getScore() 
	{
		return score; 
	}
	public void setScore(double score) 
	{
		this.score = score;
	}
}
