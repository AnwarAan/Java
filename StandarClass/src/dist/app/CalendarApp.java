package dist.app;

import java.util.Calendar;
import java.util.Date;

public class CalendarApp {
  public static void main(String[] args) {
    Date date = new Date();
    long milisecond = date.getTime();

    System.out.println(date);
    System.out.println(milisecond);

    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.YEAR, 2030);
    calendar.set(Calendar.MONTH, Calendar.JANUARY);
    calendar.set(Calendar.DAY_OF_MONTH, 10);
    calendar.set(Calendar.HOUR_OF_DAY, 10);

    System.out.println(calendar.getTime());
  }

}
