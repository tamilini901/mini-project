package TRAVEL;

public class BUS {
       private int bno;
       private boolean ac;
       private int cap;
       
       BUS(int a,boolean b,int c){
    	   this.bno=a;
    	   this.ac=b;
    	   this.cap=c;
       }
       public int get_bno(){
    	   return bno;
       }
       public boolean get_ac(){
    	   return ac;
       }
       public int get_cap() {
    	   return cap;
       }
       public void display() {
    	   System.out.println("---------");
    	   System.out.println("bus number:"+bno);
    	   System.out.println("ac??:"+ac);
    	   System.out.println("capacity:"+cap);
    	  
       }
}
