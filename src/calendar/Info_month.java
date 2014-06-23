package calendar;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Info_month {
	public static TreeMap <Integer,Info_everyday>  array_month = new TreeMap<Integer,Info_everyday>();
	
	private static double sum_sleep = 0;
	private static double sum_net = 0;
	private static double sum_education = 0;
	private static double sum_sport = 0;
	
	public static int getSum_sleep() {
		sum_sleep = 0;
		for(Entry<Integer, Info_everyday> entry : array_month.entrySet()) {
			  sum_sleep += entry.getValue().getSleep();
			}
		return (int) (sum_sleep/24);
	}
	public static int getSum_net() {
		sum_net = 0;
		for(Entry<Integer, Info_everyday> entry : array_month.entrySet()) {
			  sum_net += entry.getValue().getNet();
			}
		return (int) (sum_net/24);
	}
	public static int getSum_education() {
		sum_education = 0;
		for(Entry<Integer, Info_everyday> entry : array_month.entrySet()) {
			  sum_education += entry.getValue().getEducation();
			}
		return (int) (sum_education/24);
	}
	public static int getSum_sport() {
		sum_sport = 0;
		for(Entry<Integer, Info_everyday> entry : array_month.entrySet()) {
			  sum_sport += entry.getValue().getSport();
			}
		return (int) (sum_sport/24);
	}	

};
