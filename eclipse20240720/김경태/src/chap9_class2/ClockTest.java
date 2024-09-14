package 김경태;

import java.util.Calendar;

public class ClockTest {

}

class Clock{
	public String getLocatiopn() {return "한국";}
	int getHours() {
		return Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
	}
	int getMinutes() {
		long time = System.currentTimeMillis();
		Date date = new Date(time);
	}
}