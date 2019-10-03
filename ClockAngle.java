public class ClockAngle {

	public static void main(String[] args) { 
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Write hour");
		double h = input.nextInt();
		h=h%12;
		System.out.println("Write minutes");
		double m = input.nextInt();
		m=m%60;
		double angle = calcAngle(m,h);
		System.out.printf("The angle from hour hand to minute hand anti-clockwise is %.1f", angle);
		
	}
	
	public static double calcAngle(double minutes, double hours) {
		
		double angle=(hours*30 + 360 + (minutes*0.5)-minutes*6)%360;
		return angle;
	
	}
	
}