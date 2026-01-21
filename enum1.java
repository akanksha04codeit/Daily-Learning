//enum to create unique set of data 
//It is used constant data manipulation
public class enum1 {

	public static void main(String[] args) {
		
		checkDay ob = (d)->{
			return d.getTypeString();
		};
		weekDays w1 = weekDays.SAT;
		ob.checkDaysinWeek(w1);
		
		for(weekDays day: weekDays.values()) {
			System.out.println("Days: "+day+" type is: "+day.getTypeString());
		}
		weekDays myday = weekDays.valueOf("FRI");
		System.out.println(myday+" position is "+myday.ordinal());
	}

}
enum weekDays{
	MON("WeekDay"),
	TUE("WeekDay"),
	WED("WeekDay"),
	THU("WeekDay"),
	FRI("WeekDay"),
	SAT("WeekDay"),
	SUN("WeekEnd");
	
	private final String type;
	private weekDays(String type) {
		this.type=type;	
	}
	public String getTypeString() {
		return type;
		}
}
// @FunctionalInterface
interface checkDay{
	String checkDaysinWeek(weekDays d);
}


