package video_rental_systm;
import java.util.*;
public class video_launcher {
	public static void main(String args[]) {
		int ch;
		video_store v = new video_store();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("MAIN MENU");
			System.out.println("=========");
			System.out.println("1.Add videos");
			System.out.println("2.Check Out Video");
			System.out.println("3.Return Video");
			System.out.println("4.Receive Rating");
			System.out.println("5.List Inventory");
			System.out.println("6.Exit");
			System.out.print("Enter your choice (1..6) : ");
			ch = sc.nextInt();
			switch(ch) {
			case 1: System.out.print("Enter name of video you want to add : ");
			        String name = sc.next();
			        v.addVideo(name);
			        break;
			case 2: System.out.print("Enter name of video you want to check out : ");
			        String s = sc.next();
			        v.doCheckOut(s);
			        break;
			case 3: System.out.print("Enter name of video you want to return  : ");
	                String s1 = sc.next();
			        v.doReturn(s1);
	                break;
			case 4: System.out.print("Enter name of video you want to rate : ");
			        String s2 = sc.next();
			        System.out.print("Enter the rating for this video : ");
			        int r = sc.nextInt();
	                v.receiveRating(s2,r);
                    break;
			case 5: v.listInventory();
			        break;
			case 6: System.out.println("Thank you!!");
			break;
			}
		}while(ch<6);
		sc.close();
	}
}
