package test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;

public class Programme {
	protected String title = "";
	protected String length;
	protected String list_color;
	protected String description;
	protected String close_cap_avail;
	protected String new_rep_live;
	protected Boolean mark;

	@SuppressWarnings("unused")
	public Programme() {
		title = "";
		length = "";
		list_color = "";
		description = "";
		close_cap_avail = "";
		new_rep_live = "";
		mark = false;
	}

	public Programme(String tit,String len, String list, String desc, String close, String new_rep) {
		title = tit;
		length = len;
		list_color = list;
		description = desc;
		close_cap_avail = close;
		new_rep_live = new_rep;
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
	public String getTitle(){
		return title;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getColor(){
		return list_color;
	}
	public void setColor(String list_color) {
		this.list_color = list_color;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description){
		this.description = description;
	}
	public String getClosedCaption(){
		return close_cap_avail;
	}
	public void setClosedCaption(String close_cap_avail) {
		this.close_cap_avail = close_cap_avail;
	}
	public String getViewingType(){
		return new_rep_live;
	}
	public void setViewingType(String new_rep_live) {
		this.new_rep_live = new_rep_live;
	}
	
}

