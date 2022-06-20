package Assignment;

import java.util.Scanner;

/**
 * 
 * @author al22077
 *  Assigment 2
 */

public class SecondAssignment {
	public String dayName;
	String week[] = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

	public String getDayName() {
		return dayName;
	}

	public void setDayName(String dayName) {
		this.dayName = dayName;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Day: ");
		String day = sc.next();
		String name = day.toUpperCase();
		switch (name) {
		case "SUNDAY":
			System.out.println(this.dayName = "SUN");
			break;
		case "MONDAY":
			System.out.println(this.dayName = "MON");
			break;
		case "TUESDAY":
			System.out.println(this.dayName = "TUE");
			break;
		case "WEDNESDAY":
			System.out.println(this.dayName = "WED");
			break;
		case "THURSDAY":
			System.out.println(this.dayName = "THU");
			break;
		case "FRIDAY":
			System.out.println(this.dayName = "FRI");
			break;
		case "SATURDAY":
			System.out.println(this.dayName = "SAT");
			break;

		default:
			System.out.println("the valye dayName is " + (this.dayName = null));
			sc.close();
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SecondAssignment sa = new SecondAssignment();
		sa.setDayName(sa.dayName);
		sa.getNextDay();
		sa.getPreviousDay();
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		sa.addToCurrentDay(num);
		sc.close();

	}
	public void getNextDay() {
		String name = this.dayName;
		for (int i = 0; i < week.length; i++) {
			if (week[i] == name)
				if (i < 6) {
					System.out.println("Next DayName " + week[i + 1]);
				} else {
					i = 0;
					System.out.println("next dayname:" + week[i]);
				}
		}
	}

	public void getPreviousDay() {
		String name = this.dayName;
		for (int i = 0; i < week.length; i++) {
			if (week[i] == name) {
				if (i != 0) {
					System.out.println("Previous DayName " + week[i - 1]);
				} else {
					i = (week.length - 1);
					;
					System.out.println("previous dayname:" + week[i]);
				}
			}
		}
	}

	private void addToCurrentDay(int noOfDays) {
		for (int i = 0; i < week.length; i++) {
			if (week[i] == this.dayName) {
				if (noOfDays > 0) {
					if (i + noOfDays <= 6) {
						i += (noOfDays);
						System.out.println("days after adding the number: " + week[i]);
						break;
					} else {
						i = i - (7 - noOfDays);
						System.out.println("days after adding the number: " + week[i]);
						break;
					}
				} else {
					int a = 7 + noOfDays;
					System.out.println("days before the number:" + week[i + a]);
				}
			}
		}
	}
}
