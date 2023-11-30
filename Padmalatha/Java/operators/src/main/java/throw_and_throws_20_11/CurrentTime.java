package throw_and_throws_20_11;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.text.DateFormat;
public class CurrentTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DateFormat dfr=new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		Calendar calender=Calendar.getInstance();
		String names[]=new String[] {"padma","jyothi"};
		System.out.println(names[0]+"Logging Out at:"+dfr.format(calender.getTime()));
		
		LocalDate today=LocalDate.now();
		LocalTime time=LocalTime.now();
		System.out.println(names[1]+"Logging out at :"+today+" "+time);
		

	
	}

}
