package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Weather extends Programme {
	int sev_rating;

	public Weather() {
		length = "";
		list_color = "";
		description = "";
		close_cap_avail = "";
		new_rep_live = "";
		sev_rating = 0;

	}

	public Weather(String l, String l_colour, String descript, String c_c_a, String n_r_l, int s_r) {
		super("Weather",l,l_colour,descript,c_c_a,n_r_l);
		length = l;
		list_color = l_colour;
		description = descript;
		close_cap_avail = c_c_a;
		new_rep_live = n_r_l;
		sev_rating = s_r;
	}

	@Override
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

	public void SetRating(int R) {
		sev_rating = R;
	}

	public int GetRating() {
		return sev_rating;
	}

	public void SetLength(String L) {
		length = L;
	}

	public String GetLength() {
		return length;
	}

}