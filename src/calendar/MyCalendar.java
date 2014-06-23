package calendar;

import java.util.*;

public class MyCalendar {

	static GregorianCalendar gcalendar = new GregorianCalendar();
	static GregorianCalendar fake_variable = new GregorianCalendar();
	
	static String[] months  = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь",
			"Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
	static String[] week = {"fake_day","Вс","Пн","Вт","Ср","Чт","Пт","Сб"};
	static String[] week_fake = {"Fake","Пн","Вт","Ср","Чт","Пт","Сб","Вс"};
	
	public static GregorianCalendar getFakeVeriable() {
		return fake_variable;
	}
	public static GregorianCalendar getCalendar() {
		return gcalendar;
	}

	public static int getMinets() {
		return gcalendar.get(Calendar.MINUTE);
	}

	public static int getHours() {
		return gcalendar.get(Calendar.HOUR_OF_DAY);
	}
	public static int getSeconds() {
		return gcalendar.get(Calendar.SECOND);
	}

	public static int getDay() {
		return gcalendar.get(Calendar.DAY_OF_MONTH);
	}
	
	public static String getDayOfWeek() {
		return week[gcalendar.get(Calendar.DAY_OF_WEEK)];
	}

	public static String getMonth() {
		return months[gcalendar.get(Calendar.MONTH)];
	}

	public static int getYear() {
		return gcalendar.get(Calendar.YEAR);
	}	

	public static int getNumberDaysInMonth() {
		//кол-во дней в месяце
		return gcalendar.getActualMaximum(Calendar.DAY_OF_MONTH);
	}

	public static int getFakeNumberDaysInMonth() {
		//кол-во дней в месяце
		return fake_variable.getActualMaximum(Calendar.DAY_OF_MONTH);
	}

	public static void setFakeDataLeft() {
		int year,month,day = 1;
		//установка необходимых значений
		if(fake_variable.get(Calendar.MONTH)==0) {
				year = fake_variable.get(Calendar.YEAR)-1;
				month = 11;
			} else {
				year = fake_variable.get(Calendar.YEAR);
				month = fake_variable.get(Calendar.MONTH)-1;
			}
		fake_variable.set(year, month, day);
	}

	public static void setFakeDataRight() {
		int year,month,day = 1;
		//установка необходимых значений
		if(fake_variable.get(Calendar.MONTH)==11) {
				year = fake_variable.get(Calendar.YEAR)+1;
				month = 0;
			} else {
				year = fake_variable.get(Calendar.YEAR);
				month = fake_variable.get(Calendar.MONTH)+1;
			}
		fake_variable.set(year, month, day);
	}

	public static String getFakeMonth() {
		return months[fake_variable.get(Calendar.MONTH)];
	}

	public static int getFakeYear() {
		return fake_variable.get(Calendar.YEAR);
	}
	
	//присвоение фэйковой переменной 1-го числа текущего месяца для отображения на экране
	public static void setFakeFirstValue() {
		fake_variable.set(gcalendar.get(Calendar.YEAR), gcalendar.get(Calendar.MONTH), 1);
	}
	
	public static int getFakeFirstDayOfWeekInMonthINT() {
		String word = week[fake_variable.get(Calendar.DAY_OF_WEEK)];
		for(int i=1; i<=7;i++) {
			if(word==week_fake[i]) return i;
		}
		return 0;
	}
};
