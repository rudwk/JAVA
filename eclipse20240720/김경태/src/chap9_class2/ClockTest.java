package �����;

import java.util.Calendar;

public class ClockTest {

}

class Clock{
	public String getLocatiopn() {return "�ѱ�";}
	int getHours() {
		return Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
	}
	int getMinutes() {
		long time = System.currentTimeMillis();
		Date date = new Date(time);
	}
}