package file;

import calendar.Info_everyday;
import calendar.Info_month;
import calendar.MyCalendar;

import java.io.*;

public class WriteFile {
	
	public void new_write_everyday(int ch_day,Info_everyday day) {
		String way = "info/" + MyCalendar.getYear() + "/" + MyCalendar.getMonth() + ".txt";
		try(BufferedWriter write = new BufferedWriter(new FileWriter(way,true));) {
			write.newLine();
			write.write(ch_day+" "+day.toString());
		}
		catch (IOException e) {}
		new ReadFile(MyCalendar.getYear(),MyCalendar.getMonth());
	} 
	
	public void rewrite(int remove_day, int year, String month, Info_everyday day){
		//удаляем ин-фо о дне
		Info_month.array_month.remove(remove_day);
		
		//Записываем в массив новую информацию
		Info_month.array_month.put(remove_day, day);
		
		// Записываем в файл
		String way = "info/"+year+"/"+month+".txt";
		String line = Info_month.array_month.firstKey()+" "+Info_month.array_month.get(Info_month.array_month.firstKey()).toString();
		
		//пишем в очищенный файл 1-ю строку
		try(BufferedWriter output = new BufferedWriter(new FileWriter(way));) {
			output.newLine();
			output.write(line);
			Info_month.array_month.remove(Info_month.array_month.firstKey());
			output.close();
			}
		catch(IOException e) {
			System.out.println(e);
		}
		
		//пишем все остальные строки
		try(BufferedWriter output = new BufferedWriter(new FileWriter(way,true));) {
			while(Info_month.array_month.isEmpty()!=true) {
				output.newLine();
				line = Info_month.array_month.firstKey()+" "+Info_month.array_month.get(Info_month.array_month.firstKey()).toString();
				output.write(line);		
				Info_month.array_month.remove(Info_month.array_month.firstKey());
				}
			}
		catch(IOException e) {
			System.out.println(e);
		}
		new ReadFile(MyCalendar.getFakeYear(),MyCalendar.getFakeMonth());
	}
	
	public static void setflag(int flag) {
		try(BufferedWriter write = new BufferedWriter(new FileWriter("info/flag.txt"));) {
			write.write(flag+"");
		}
		catch (IOException e) {}
	}
};
