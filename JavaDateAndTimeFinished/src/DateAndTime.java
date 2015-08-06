import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateAndTime {

	public static void main(String[] args) {
		// Date, Date compare, date format.Gregorian Calendar
		//Date and time, Date format ,deprecated
		
		 Date currentDate = new Date();
	     System.out.println(currentDate.toString());
	     
	     
	     
	     //Formatting the date output
	     SimpleDateFormat dateFormat = 
	    new SimpleDateFormat ("YYYY-MM-dd");
	     System.out.println("Current Date: " + dateFormat.format(currentDate));
	     
	     SimpleDateFormat dateFormat2 = 
	    		    new SimpleDateFormat ("dd-MMM-YYYY");
	     System.out.println("Current Date: " + dateFormat2.format(currentDate));
	     
	     
	     // Create Dates
	     Date date1 = new Date(2015, 7, 11);
	     Date date2 = new Date(2015, 7, 15);
	     
	     //Create Date using Calendar
	     Calendar cal = Calendar.getInstance();
	     cal.set(Calendar.YEAR, 2015);
	     cal.set(Calendar.MONTH, Calendar.AUGUST);
	     cal.set(Calendar.DAY_OF_MONTH, 1);
	     Date date3 = cal.getTime();
	     
	     
	  // Compare Dates
	     if(date1.after(date2)){
             System.out.println("Date1 is after Date2");
         }

         if(date1.before(date2)){
             System.out.println("Date1 is before Date2");
         }

         if(date1.equals(date2)){
             System.out.println("Date1 is equal Date2");
         }
         
         
         if(date3.compareTo(date2)>0){
             System.out.println("date3 is after Date2");
         }else if(date3.compareTo(date2)<0){
             System.out.println("date3 is before Date2");
         }else if(date3.compareTo(date2)==0){
             System.out.println("date3 is equal to Date2");
         }

	}

}
