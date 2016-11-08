package test;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Formatter;
import java.util.Scanner;

public class Comedy extends Programme {
	private String Denomination;
	private String Title;
	private String length;
	private Formatter m;
	String title;
	String stars_list;

	public Comedy() {
		length = "";
		list_color = "";
		description = "";
		close_cap_avail = "";
		new_rep_live = "";
		title = "";
		stars_list = "";

	}

	public Comedy(String lngth, String l_colour, String descript, String closecap, String n_r_l, String t_itle,
			String s_l) {
		//Calls Parent Class
		super(t_itle,lngth,l_colour,descript, closecap, n_r_l);
		length = lngth;
		list_color = l_colour;
		description = descript;
		close_cap_avail = closecap;
		new_rep_live = n_r_l;
		title = t_itle;
		stars_list = s_l;
	}

	public void Select() {
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

	public void SetStars_list(String s_l) {
		stars_list = s_l;
	}

	public void SetTitle(String t_itle) {
		title = t_itle;
	}

	public String GetStars_list() {
		return stars_list;
	}

	public String GetTitle() {
		return title;
	}

	public void Display() {
		System.out.println("The length of the program is:" + length);
		System.out.println("Programme description:" + description);
	}

	public void Description() {
		System.out.println("" + description);
	}

	public void CloseCap() {
		System.out.println("" + close_cap_avail);
	}

	public void new_rep_live() {
		System.out.println("" + new_rep_live);
	}
}// end class definition
