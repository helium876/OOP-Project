package test;


public class DateReleased {
	int Day;
	int Month;
	int Year;
public DateReleased(int d, int m, int y)
	{
		Day = d;
		Month = m;
		Year = y;
	}

public void SetDay(int d){
	Day =d;
}

public void SetMonth(int m)	{
	Month =m;
}

public void SetYear(int y){
	Year =y;
}

public int GetDay (){
	return Day;
}

public int GetMonth (){
	return Month;
}

public int GetYear (){
	return Year;
}
}
