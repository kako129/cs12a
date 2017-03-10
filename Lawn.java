//Lawn.java
//Calculates the are of the rates at which a lawn on the lot will be mowed in ssquare feet per second
import java.util.Scanner;
class Lawn{
	public static void main( String[] args) {
		double length1, width1, length2, width2,time, area;
		int h,m,s;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter length and width of the lot, in feet: ");
		length1 = sc.nextDouble();
		width1= sc.nextDouble();


		System.out.print("Enter the length and width of the house, in feet: ");
		length2= sc.nextDouble();
		width2 = sc.nextDouble(); 

		area = (length1*width1)-(
			length2*width2);

		System.out.print("The lawn area is ");
		System.out.println(area+ " square feet");

		System.out.print("Enter the mowing rate, in square feet per second: ");
		time  = sc.nextDouble();
		s = (int) Math.round(area/time);
		m = s/60;
		s = s%60;
		h = m/60;
		m = m%60;
		System.out.print("The mowing time is ");
		System.out.println(h+" hour" + (h==1? " " : "s ") +m+" minute" + (m==1? " " : "s ") +s+" second" + (s==1? " " : "s ")); 
		
	}
}
