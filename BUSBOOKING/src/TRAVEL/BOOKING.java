package TRAVEL;
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class BOOKING {
	String name;
	int busno;
	Date date;
	BOOKING(Scanner sc){
		System.out.println("ur name?:");
		 name=sc.next();
		System.out.println("enter bus no:");
		busno=sc.nextInt();
		System.out.println("Enter ur arrival date in dd-mm-yyy:");
		String n=sc.next();
	
	SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
	try{
	  date=sdf.parse(n);
	}
	catch(ParseException e) {
		e.printStackTrace();
	}
	}

   int booked=0;
   int capacity=0;
   public boolean isavailable(ArrayList<BUS>buses,ArrayList<BOOKING>bookings) {
	   for(BUS bb:buses) {
		   if(bb.get_bno()==busno) {
			   capacity=bb.get_cap();   
		   }
	for(BOOKING aa:bookings) {
		if(aa.date.equals(date)&&aa.busno==busno) {
			booked++;
		}
	}
	   }
	   return booked<capacity;
   }
   public void display_info() {
	   for(BUS bbb:buses) {
		   capacity =capacity - booked;
	   }return capacity;
   }
}
