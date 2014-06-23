package file;

import java.io.*;
import java.util.*;

import calendar.Info_everyday;
import calendar.Info_month;

public class ReadFile {
	
	private static Scanner scanner;

	public ReadFile(int year, String month_name) {
				
		String way = "info/"+year+"/"+month_name+".txt";
			try {
				Scanner scanner = new Scanner(new File(way));
				
				while(scanner.hasNextLine()){
					int pos = scanner.nextInt();
					int ch1 = scanner.nextInt();
					int ch2 = scanner.nextInt();
					int ch3 = scanner.nextInt();
					int ch4 = scanner.nextInt();
					Info_month.array_month.put(pos, new Info_everyday(ch1,ch2,ch3,ch4));
				}
				scanner.close();
			} catch(FileNotFoundException e) {} 
	}
	
	public static int getflag() throws FileNotFoundException {
		scanner = new Scanner(new File("info/flag.txt"));
		return scanner.nextInt();
	}
};
