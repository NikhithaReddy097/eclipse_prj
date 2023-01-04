package light;
import java.util.*;
public class electronic_watch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the seconds : ");
		int seconds = sc.nextInt();
		int hr,min;
		hr = (seconds/3600)%24;
		seconds = seconds%3600;
		min = seconds/60;
		seconds = seconds%60;
		System.out.print(hr+":");
		System.out.print(String.format("%0"
				+ ""
				+ ""
				+ "2d", min)+":");
		System.out.print(String.format("%02d", seconds));
		sc.close();
		
	}
}
