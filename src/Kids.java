package test;

import java.util.Formatter;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Kids extends Programme {
	private String ageRange;
	private String length;
	private String Title;
	// private Formatter k;
	private Formatter m;

	public Kids() {
		ageRange = "";
		length = "";
		Title = "";
	}

	public Kids(String ln, String Tit, String newornot, String descript, String capt, String AgeRange, String list) {
		super(Tit,"1",list,descript,capt,newornot);
		length = ln;
		Title = Tit;
		description = descript;
		close_cap_avail = capt;
		new_rep_live = newornot;
		ageRange = AgeRange;
		list_color = list;
	}

	public void setageRange(String Age) {
		ageRange = Age;
	}

	public void setTitle(String Tit) {
		Title = Tit;
	}

	public String GetageRange() {
		return ageRange;
	}

	public String GetTitle() {
		return Title;
	}

	/*
	 * public String getLength() { return length; } public void setLength(float
	 * f) { this.length = f; }
	 */
	@Override
	public void Select() {
		System.out.println("The Title of the programme is: " + Title);
		System.out.println("The length of the programme is: " + length);
		System.out.println("The description for this programme is: " + description);
		System.out.println("The list color should be " + list_color);
		System.out.println("The Age Range of the programme is: " + ageRange);
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

}// end class