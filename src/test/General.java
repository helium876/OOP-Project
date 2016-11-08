package test;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;

public class General extends Programme {
	private String Title;
	private String length;
	private Formatter m;

public General(){
	Title = "";
	length = "0";
}
public General(String ln,String Tit, String descript,String capt,String newornot, String list){
	super(Tit,ln,list,descript,capt, newornot);
	length = ln;
	 Title = Tit;
	 description = descript;
	 close_cap_avail = capt;
	 new_rep_live = newornot;
	 list_color = list;
}
public void setTitle(String tit){
	Title = tit;
}
public void setlength(String ln){
	length = ln;
}
public String GetTitle(){
	return Title;
}
public String Getlength(String ln){
	return length;
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


}//end class
