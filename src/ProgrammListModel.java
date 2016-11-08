package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;

public class ProgrammListModel {
	private String[] columnNames;
	private int row_number = 11;
	private int column_number = 24;
	private String column;
	private Object[][] data = new Object[24][column_number];
	private Object[][] detailed_data = new Object[13][26];
	private ArrayList<ArrayList<Programme>> programme_list = new ArrayList<ArrayList<Programme>>();

	public ProgrammListModel() {
		// TODO Auto-generated constructor stub
	}

	Random rand = new Random();
	BufferedWriter bw = null;
	BufferedReader br = null;
	StringBuilder sb = new StringBuilder();
	Programme pw = null;
	String row = "";
	String line = null;
	String[] words = null;
	int column_count = 0;

	public void buildProgrammeListFile() {
		programme_list = buildProgrammeList();
		buildDetailedProgrammeListFile(programme_list, bw, sb, pw);

		try {
			bw = new BufferedWriter(new FileWriter("programmeList.txt"));
			for (int i = 0; i < 11; i++) {
				while (column_count < 24) {
					pw = programme_list.get(i).get(column_count);
					row += pw.getTitle() + " ";
					column_count++;
				}
				bw.write(row + "\n");
				row = "";
				column_count = 0;
			}
			bw.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public Object[][] getProgrammeListData() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("programmeList.txt"));
			String line = null;
			String[] words = null;
			detailed_data = getDetailedProgrammeList();
			int row_count = 0;
			while ((line = br.readLine()) != null) {
				words = line.split(" ");
				for (int column_count = 0; column_count < 24; column_count++) {
					data[row_count][column_count] = words[column_count];
				}
				row_count++;
			}
			br.close();
			return data;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("File not found");
			return null;
		}
	}

	public void buildDetailedProgrammeListFile(ArrayList<ArrayList<Programme>> programme_list, BufferedWriter bw,
			StringBuilder sb, Programme pw) {
		int column_count = 0;
		String row = "";
		try {
			bw = new BufferedWriter(new FileWriter("detailedProgrammeList.txt"));
			for (int i = 0; i < 11; i++) {
				while (column_count < 24) {
					pw = programme_list.get(i).get(column_count);
					row = pw.getDescription() + ";" + pw.getTitle() + ";" + pw.getClosedCaption() + ";" + pw.getColor()
							+ ";" + pw.getLength() + ";" + pw.getViewingType() + "\n";
					bw.write(row);
					column_count++;
				}
				row = "";
				column_count = 0;
			}
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Object[][] getDetailedProgrammeList() {
		try {
			br = new BufferedReader(new FileReader("detailedProgrammeList.txt"));
			int row_count = 0;
			int i = 0;
			int j = 0;
			while ((line = br.readLine()) != null) {
				words = line.split(";");
				detailed_data[i][j] = words[0];
				System.out.println(detailed_data[i][j] + " index:" + i + ":" + j);
				if (j == 25) {
					j = 0;
					i++;
				}
				j++;
			}
			br.close();
			return detailed_data;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	private ArrayList<ArrayList<Programme>> buildProgrammeList() {
		ArrayList<ArrayList<Programme>> programmeList = new ArrayList<ArrayList<Programme>>();
		ArrayList<Programme> comedy_list = buildComedy();
		ArrayList<Programme> general_list = buildGeneral();
		ArrayList<Programme> gospel_list = buildGospel();
		ArrayList<Programme> kids_list = buildKids();
		ArrayList<Programme> movie_list = buildMovie();
		ArrayList<Programme> news_list = buildNews();
		ArrayList<Programme> weather_list = buildWeather();

		programmeList.add(news_list);
		programmeList.add(general_list);
		programmeList.add(kids_list);
		programmeList.add(movie_list);

		// rebuild movie list for now movies
		movie_list = buildMovie();
		programmeList.add(movie_list);
		programmeList.add(gospel_list);
		programmeList.add(weather_list);
		programmeList.add(comedy_list);
		programmeList.add(general_list);
		programmeList.add(general_list);
		programmeList.add(general_list);
		return programmeList;

	}

	private ArrayList buildComedy() {
		ArrayList<Comedy> comedy_list = new ArrayList<Comedy>();
		String random_length = "1 hour";
		String[] random_description = { "Number one comedy in a America", "Perfect movie for a great laugh",
				"Laugh your socks off" };
		String[] random_closed_caption = { "yes", "no" };
		String[] new_rep_live = { "new", "repeated", "live" };
		String[] random_title = { "Click", "Get-Hard", "50-First-Dates" };
		String[][] random_stars_list = { { "Adam Sandler", "Rob Schnieder", "Will Ferrell" },
				{ "Jessica Alba", "Hallie Berry", "Brad Pitt" }, { "James Franco", "Seth Rogen", "Rebel Wilson" } };
		for (int i = 0; i < 24; i++) {
			Comedy cm = new Comedy(random_length, "Yellow", random_description[0],
					random_closed_caption[(int) Math.ceil(rand.nextInt(1))],
					new_rep_live[(int) Math.ceil(rand.nextInt(2))], random_title[(int) Math.ceil(rand.nextInt(2))],
					random_stars_list[(int) Math.ceil(rand.nextInt(2))][(int) Math.ceil(rand.nextInt(2))]);
			comedy_list.add(cm);
		}

		return comedy_list;
	}

	private ArrayList buildGeneral() {
		ArrayList<General> general_list = new ArrayList<General>();
		String[] random_length = { "1 hour" };
		String[] random_title = { "Sherlock", "James-Bond-007", "Secondhand-Lions" };
		String[] random_description = { "Good movie for everyone", "Perfect for the Entire Family", "A sure Thriller" };
		String[] random_closed_caption = { "yes", "no" };
		String[] new_rep_live = { "new", "repeated", "live" };

		for (int i = 0; i < 24; i++) {
			general_list.add(new General(random_length[0], random_title[(int) Math.ceil(rand.nextInt(2))],
					random_description[(int) Math.ceil(rand.nextInt(2))],
					random_closed_caption[(int) Math.ceil(rand.nextInt(1))],
					new_rep_live[(int) Math.ceil(rand.nextInt(2))], "White"));
		}
		return general_list;
	}

	private ArrayList buildGospel() {
		ArrayList<Gospel> gospel_list = new ArrayList<Gospel>();
		String[] random_length = { "1 hour" };
		String[] random_title = { "Joice-Kenny", "An-Hour-Of-Praise", "Behold-He-Cometh" };
		String[] random_denomination = { "Catholic", "Methodist", "Anglican" };
		String[] random_description = { "Praise Jesus", "An hour of Praise", "Family Values" };
		String[] random_closed_caption = { "yes", "no" };
		String[] new_rep_live = { "new", "repeated", "live" };

		for (int i = 0; i < 24; i++) {
			gospel_list.add(new Gospel(random_length[0], random_denomination[(int) Math.ceil(rand.nextInt(2))],
					random_title[Math.abs(rand.nextInt(2))], random_description[(int) Math.ceil(rand.nextInt(2))],
					random_closed_caption[(int) Math.ceil(rand.nextInt(1))],
					new_rep_live[(int) Math.ceil(rand.nextInt(1))], "Blue"));
		}
		return gospel_list;
	}

	private ArrayList buildKids() {
		ArrayList<Kids> kids_list = new ArrayList<Kids>();
		String[] random_length = { "1 hour" };
		String[] random_title = { "Spongebob-Squarepants", "Dora-The-Explorer", "Danny-Phantom" };
		String[] random_description = { "Everyone's favourite show", "Great show for toddlers",
				"Fit for the young and young at heart" };
		String[] random_closed_caption = { "yes", "no" };
		String[] random_age_range = { "3-6", "7-8", "8-12" };
		String[] new_rep_live = { "new", "repeated", "live" };

		for (int i = 0; i < 24; i++) {
			kids_list.add(new Kids(random_length[0], random_title[(int) Math.ceil(rand.nextInt(2))],
					new_rep_live[(int) Math.ceil(rand.nextInt(2))],
					random_description[(int) Math.ceil(rand.nextInt(2))],
					random_closed_caption[(int) Math.ceil(rand.nextInt(1))],
					random_age_range[(int) Math.ceil(rand.nextInt(2))], "Purple"));
		}
		return kids_list;
	}

	private ArrayList buildMovie() {
		ArrayList<Movie> movie_list = new ArrayList<Movie>();
		String[] random_length = { "1 hour" };
		String[] random_ratings = { "1/5", "2/5", "3/5", "4/5", "5/5" };
		String[] random_title = { "Transporter", "Die-Another-Day", "Agent-47" };
		String[] random_description = { "Action packed Thriller", "Number one Action movie in America",
				"Explosive film" };
		String[] random_closed_caption = { "yes", "no" };
		String[] random_age_range = { "3-6", "7-8", "8-12" };
		String[] new_rep_live = { "new", "repeated", "live" };
		String[][] random_stars_list = { { "Jason Statum", "Slyvester Stalone", "Terry Crews" },
				{ "Jessica Alba", "Angelina Jolie", "Brad Pitt" },
				{ "Bruce Willis", "Robert De Niro", "Liam Nesson" } };
		for (int i = 0; i < 24; i++) {
			movie_list.add(new Movie(random_ratings[(int) Math.ceil(rand.nextInt(4))],
					random_stars_list[(int) Math.ceil(rand.nextInt(2))][(int) Math.ceil(rand.nextInt(2))],
					random_title[(int) Math.ceil(rand.nextInt(2))], random_length[0], "Red",
					random_description[(int) Math.ceil(rand.nextInt(2))],
					random_closed_caption[(int) Math.ceil(rand.nextInt(1))],
					new_rep_live[(int) Math.ceil(rand.nextInt(2))], (int) Math.ceil(rand.nextInt(31) + 1),
					(int) Math.ceil(rand.nextInt(12) + 1), (int) Math.ceil(rand.nextInt(1994) + 1)));
		}
		return movie_list;
	}

	private ArrayList buildNews() {

		ArrayList<News> news_list = new ArrayList<News>();
		String random_period = "1 hour";
		String random_length = "1 hour";
		String[] random_ratings = { "1/5", "2/5", "3/5", "4/5", "5/5" };
		String[] random_description = { "World BBC NEWS", "TVJ NEWS", "SPORTS NEWS" };
		String[] random_closed_caption = { "yes", "no" };
		String[] new_rep_live = { "new", "repeated", "live" };

		for (int i = 0; i < 24; i++) {
			news_list.add(new News(random_period, random_length, "White",
					random_description[(int) Math.ceil(rand.nextInt(2))],
					random_closed_caption[(int) Math.ceil(rand.nextInt(1))],
					new_rep_live[(int) Math.ceil(rand.nextInt(2))]));
		}
		return news_list;

	}

	private ArrayList buildWeather() {

		ArrayList<Weather> weather_list = new ArrayList<Weather>();
		String[] random_length = { "1 hour" };
		String[] random_description = { "Hourly update on the Weather", "Weather Alert", "Weather" };
		String[] random_closed_caption = { "yes", "no" };
		String[] new_rep_live = { "new", "repeated", "live" };
		int[] random_severity_rating = { 0, 1, 2, 3, 4 };

		for (int i = 0; i < 24; i++) {
			weather_list.add(new Weather(random_length[0], "Green", random_description[Math.abs(rand.nextInt(2))],
					random_closed_caption[Math.abs(rand.nextInt(1))], new_rep_live[Math.abs(rand.nextInt(2))],
					random_severity_rating[Math.abs(rand.nextInt(5))]));
		}
		return weather_list;

	}
}
