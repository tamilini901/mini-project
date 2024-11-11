package TRAVEL;
import java.util.*;
public class master {
public static void main(String[] args) {
	ArrayList<BUS>buses=new ArrayList<>();
	ArrayList<BOOKING>bookings=new ArrayList<>();
	
	buses.add(new BUS(1,true,58));
	buses.add(new BUS(2,true,500));
	buses.add(new BUS(3,true,2));
	buses.add(new BUS(4,true,2));
	
	for(BUS b:buses) {
		b.display();
	}
	
	int ch=1;
	Scanner sc=new Scanner(System.in);
	while(ch==1) {
		System.out.println("Enter 1 to book and 2 for exit and 3 for showing info...");
		ch = sc.nextInt();
		if(ch==1) {
			BOOKING book=new BOOKING(sc);
			if(book.isavailable(buses,bookings)) {
			System.out.println("bus seat is confirmed!!");
			bookings.add(book);
			}
			else {
				System.out.println("sorry no seat is available!!..");
			}
	    if(ch==3) { 
	    	System.out.println(display_info());	
	    }
		}
		
	}
}
}
