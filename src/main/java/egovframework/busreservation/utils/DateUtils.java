package egovframework.busreservation.utils;

public class DateUtils {

	public int[] getMonths() {
		int[] months = new int[12];
		for(int i = 0; i < 12; i++) {
			months[i] = i + 1;
		}
		return months;
	}
	
	public int[] getDays() {
		int[] days = new int[31];
		for(int i = 0; i < 31; i++) {
			days[i] = i + 1;
		}
		return days;
	}
	
	public int[] getTimes() {
		int[] times = new int[10];
		for(int i = 0; i < 10; i++) {
			times[i] = 9 + i;
		}
		return times;
	}
}
