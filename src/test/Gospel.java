package test;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;

public class Gospel extends Programme {
	private String Denomination;
	private String Title;
	private String length;
	private Formatter m;

	public Gospel() {
		Denomination = "";
		Title = "";
		length = "";
	}

	public Gospel(String ln, String Dem, String Tit, String descript, String capt, String newornot, String list) {
		super(Tit,ln,list,descript,capt,newornot);
		length = ln;
		Denomination = Dem;
		Title = Tit;
		description = descript;
		close_cap_avail = capt;
		new_rep_live = newornot;
		list_color = list;
	}

	public void setDemoination(String d) {
		Denomination = d;
	}

	public void setTitle(String t) {
		Title = t;
	}

	public String getDenomination() {
		return Denomination;
	}

	public String getTitle() {
		return Title;
	}

	@Override
	public void Select() {
		System.out.println("The Title of the programme is: " + Title);
		System.out.println("The length of the programme is: " + length);
		System.out.println("The description for this programme is: " + description);
		System.out.println("The Denomination for this programme is: " + Denomination);
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

}// end class definition