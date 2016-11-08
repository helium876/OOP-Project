package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;

public class News extends Programme {
	private String news_period;

	public News(String Period, String Leng, String Color, String Des, String closecap, String newr) {
		super("News",Leng,"White",Des, closecap, newr);
		news_period = Period;
		length = Leng;
		list_color = Color;
		description = Des;
		close_cap_avail = closecap;
		new_rep_live = newr;
	}

	public void setPeriod(String Period) {
		news_period = Period;
	}

	public void setLength(String Len) {
		length = Len;
	}

	public String getPeriod() {
		return news_period;
	}

	public String getLength() {
		return length;
	}

	@Override
	public void Select() {
		System.out.println("The News Period is: " + news_period);
		System.out.println("The length of the programme is: " + length);
		System.out.println("The description for this programme is: " + description);
		System.out.println("The list color should be " + list_color);
		if (close_cap_avail == "Yes") {
			System.out.println("This programme has closed caption available.");
		} else {
			System.out.println("This programme does not have closed caption avaiable.");
		}
		if (new_rep_live == "new") {
			System.out.println("This is a new programme");
		} else if (new_rep_live == "repeat") {
			System.out.println("This programme is being repeated");
		} else if (new_rep_live == "live") {
			System.out.println("This is a live programme");
		}
	}
}