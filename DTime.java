import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class DTime {
	
	public static void main(String[] args) {
		LocalDate toDate=LocalDate.now();
		System.out.println("Date: "+toDate);
		
		LocalTime toTime=LocalTime.now();
		System.out.println("Time: "+toTime);
		
		LocalDateTime toDateTime=LocalDateTime.now();
		DateTimeFormatter dtFormat=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		System.out.println("Local Format: "+toDateTime.format(dtFormat));
		
		LocalDateTime futureDateTime=toDateTime.plusDays(10);
		System.out.println("Future Date time after 10 days: "+futureDateTime);
		
		ZonedDateTime zone=ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
		System.out.println("Time in Japan now: "+zone);
		
		Duration pTime=Duration.between(LocalTime.of(7, 30), LocalTime.of(16, 45));
		System.out.println("Duration or claculate time between: "+pTime);
		
		LocalDate fDate=toDate.minusDays(5);
		Period dDate=Period.between(fDate, toDate);
		System.out.println("Days Difference: "+dDate);
		
		String strDate="10/10/2015";  //string to date
		DateTimeFormatter formatStr=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d=LocalDate.parse(strDate,formatStr);
		System.out.println("Convert date: "+d.format(formatStr));
		
		String dateStr=d.toString();
		System.out.println("Convert date to string: "+dateStr);
		
		DateTimeFormatter formatTime=DateTimeFormatter.ofPattern("hh:mm a");
		System.out.println("12 hr format: "+toTime.format(formatTime));
		
		YearMonth yearMonth=YearMonth.of(2025, 2);
		System.out.println("YearMonth: 2025, 2 "+yearMonth);
		LocalDate firstDay=yearMonth.atDay(1);
		System.out.println("First Day: "+firstDay);
		
		DayOfWeek startDay=firstDay.getDayOfWeek();
		System.out.println("Start Day: "+startDay);
		
		int numDays=yearMonth.lengthOfMonth();
		System.out.println("Calendar: "+yearMonth);
//		System.out.println("days in months: "+numDays);
		System.out.println("Mon Tue Wed Thu Fri sat Sun");
		//space
		int sDayValue=startDay.getValue() % 7;
		for(int i=0; i<sDayValue; i++) {
			System.out.println("   ");
		}
		for(int day=1; day<=numDays; day++) {
			System.out.printf("%3d ",day);
			if((day+sDayValue) % 7 == 0) {
				System.out.println();
			}
		}
		
		printCalendar(2025, "Feb");
	}

	static void printCalendar(int year,String monthName) {
		Month monthObj= Month.valueOf(monthName);
		int month= monthObj.getValue();
		String mName=Month.of(month).getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
		System.out.println(mName);
	}

}

