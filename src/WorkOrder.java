import java.util.Scanner;
import java.time.*;
import java.time.temporal.ChronoUnit;


public class WorkOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jobDone;
		double dateDiff;
		double quoteDiff;
		int daysQuoted = 0, daysWorked, startYear = 0, startMonth = 0, startDay = 0, endYear = 0, endMonth = 0, endDay = 0;
		double fine, fee, total;
		final double FINE = 200;
		final double FEE = .06043;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("City of Golden Valley Maintenance Job List");
		System.out.println("------------------------------------------");
		System.out.print("Please enter the description of the job you worked on:  ");
		jobDone = keyboard.nextLine();
			
		System.out.print("How many days (1-100 days) was quoted to complete the job?:  ");
		
		boolean flag = true;
		
		while (flag == true)
		{
			flag = false;
			try
			{				
				daysQuoted = keyboard.nextInt();
				while (daysQuoted < 1 || daysQuoted > 100)
				{
					System.out.print("Invalid entry, please try again:  ");
					daysQuoted = keyboard.nextInt();
				}
			}
			catch (Exception e)
			{
				System.out.print("Wrong format, please try again:  ");
				keyboard.next();
				flag = true;
			}
		}		
		
		boolean flag1 = true;
		
		while (flag1 == true)
		{
			flag1 = false;
			try
			{
				System.out.print("Please enter the Month the job was started: ");
				startMonth = keyboard.nextInt();
				
				
				while (startMonth < 1 || startMonth > 12)
				{
					System.out.print("Invalid entry, please enter a month between 1-12: ");
					startMonth = keyboard.nextInt();				
				}				
			}
			catch (Exception e)
			{
				System.out.print("Wrong format, ");
				keyboard.next();
				flag1 = true;
			}
		}
		
		boolean flag2 = true;
		
		while (flag2 == true)
		{
			flag2 = false;
			try
			{
				System.out.print("Please enter the Day the job was started: ");
				startDay = keyboard.nextInt();
				
				while (startDay < 1 || startDay > 12)
				{
					System.out.print("Invalid entry, please enter a day between 1-31: ");
					startDay = keyboard.nextInt();
				}				
			}
			catch (Exception e)
			{
				System.out.print("Wrong format, ");
				keyboard.next();
				flag2 = true;
			}
		}
		
		boolean flag3 = true;
		
		while (flag3 == true)
		{
			flag3 = false;
			try
			{
				System.out.print("Please enter the Year the job was started: ");
				startYear = keyboard.nextInt();
				
				while (startYear < 1000 || startYear > 9999)
				{
					System.out.print("Invalid entry, please enter a 4-digit year: ");
					startYear = keyboard.nextInt();
				}				
			}
			catch (Exception e)
			{
				System.out.print("Wrong format, ");
				keyboard.next();
				flag3 = true;
			}
		}
		
		boolean flag4 = true;
		
		while (flag4 == true)
		{
			flag4 = false;
			try
			{
				System.out.print("Please enter the Month the job was completed: ");
				endMonth = keyboard.nextInt();
				
				
				while (endMonth < 1 || endMonth > 12)
				{
					System.out.print("Invalid entry, please enter a month between 1-12: ");
					endMonth = keyboard.nextInt();				
				}				
			}
			catch (Exception e)
			{
				System.out.print("Wrong format, ");
				keyboard.next();
				flag4 = true;
			}
		}
		
		boolean flag5 = true;
		
		while (flag5 == true)
		{
			flag5 = false;
			try
			{
				System.out.print("Please enter the Day the job was completed: ");
				endDay = keyboard.nextInt();
				
				while (endDay < 1 || endDay > 31)
				{
					System.out.print("Invalid entry, please enter a day between 1-31: ");
					endDay = keyboard.nextInt();
				}				
			}
			catch (Exception e)
			{
				System.out.print("Wrong format, ");
				keyboard.next();
				flag5 = true;
			}
		}
		
		boolean flag6 = true;
		
		while (flag6 == true)
		{
			flag6 = false;
			try
			{
				System.out.print("Please enter the Year the job was completed: ");
				endYear = keyboard.nextInt();
				
				while (endYear < 1000 || endYear > 9999)
				{
					System.out.print("Invalid entry, please enter a 4-digit year: ");
					endYear = keyboard.nextInt();
				}				
			}
			catch (Exception e)
			{
				System.out.print("Wrong format, ");
				keyboard.next();
				flag6 = true;
			}
		}		
		
		LocalDate jobStart = LocalDate.of(startYear, startMonth, startDay);
		LocalDate jobEnd = LocalDate.of(endYear, endMonth, endDay);
		
		dateDiff = (double) ChronoUnit.DAYS.between(jobStart, jobEnd);		
		
		
		if (dateDiff > daysQuoted)
		{
			quoteDiff = dateDiff - daysQuoted;
			fine = FINE * quoteDiff;
			fee = fine * FEE;
			
			total = fine + fee;
			
			System.out.println("------------------------------------------");
			System.out.print("Quantity of days over: " + quoteDiff + "\nFine: $" + fine + " Hardship fee: $" + fee + " Total Payment: $" + total);
		}
		else
		{
			System.out.println("------------------------------------------");
			System.out.print("You finished the job on time.  Keep up the good work!");
		}
		
	}

}
