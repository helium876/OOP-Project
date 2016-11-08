package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;

public class Movie extends Programme{

	private String rating;
    private String stars_list;
    private String Title;
    private Formatter m;
		DateReleased Mov;

	Movie(String Rtings, String S_List, String Tit, String Leng, String Color, String Des, String closecap, String newr, int day, int mon, int year){
		super(Tit,Leng,Color,Des,closecap,newr);
		rating= Rtings;
		stars_list = S_List;
		Title=Tit;
		DateReleased TempMov = new DateReleased(day,mon,year);
		Mov = TempMov;
		length = Leng;
		list_color= Color;
		description= Des;
		close_cap_avail=closecap;
		new_rep_live = newr;
	}

	
	public void SetRating( String Rtings){
		rating= Rtings;
	}
	
	public void SetStars_list(String S_List){
		stars_list = S_List;
	}

	public void SetTitle(String tit){
		Title=tit;
	}

	public String GetRating(){
		return rating;
	}

	public String GetStars_list() 
	{
		return stars_list;
	}

	public String GetTitle(){
		return Title;
	}
	@Override
	public void Select(){
		System.out.println("The Title of the programme is: " + Title);
		System.out.println("The length of the programme is: " + length);
		System.out.println("The description for this programme is: " + description);
		System.out.println("The list color should be " + list_color);
		if (close_cap_avail == "Yes"){
			System.out.println("This programme has closed caption available.");
		}else {
			System.out.println("This programme does not have closed caption avaiable.");
		}
		if (new_rep_live == "new"){
			System.out.println("This is a new programme");
		}else if (new_rep_live == "repeat"){
			System.out.println("This programme is being repeated");
		}else if (new_rep_live == "live"){
			System.out.println("This is a live programme");
		}
	}

}


