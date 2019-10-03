public class ClockAngle {

	public static double calcAngle(double hours, double minutes, double seconds) {
		
		minutes=minutes+seconds/60;
		double angle=(hours*30 - minutes*5.5)%360;
		return angle;
	
	}
	
	public static void main(String[] args) { 
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Write hour");
		double h = scan.nextDouble();
		h=h%12;
		System.out.println("Write minutes");
		double m = scan.nextDouble();
		m=m%60;
		System.out.println("Write seconds");
		double s = scan.nextDouble();
		s=s%60;
		double angle = calcAngle(h,m,s);
		System.out.printf("The angle from hour hand to minute hand anti-clockwise is %.1f", angle);
		
	}
	
}