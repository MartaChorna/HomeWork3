package pack2;
import java.time.LocalDate;
import java.util.Calendar;

public class Date {
public static void main(String[] args)  {
		
		LocalDate currentDate = LocalDate.now();
        System.out.println("current local date : " + currentDate);
		
		Calendar cal = Calendar.getInstance(); 
		cal.add(Calendar.MONTH, 0);
		cal.add(Calendar.DAY_OF_WEEK, 0);
		cal.add(Calendar.YEAR, 2);
		
		
		  
		
		System.out.println(cal.getTime());
        
        
      
    }

}
		


