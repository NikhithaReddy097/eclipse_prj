package video_rental_systm;
import java.util.*;
public class video_store {
	video store[] = new video[100];
	ArrayList<video> st = new ArrayList<video>();
	int k=0;
	public void addVideo(String name) {
		st.add(new video(name));
		System.out.println("Video \""+name+"\" added successfully.\n");
	}
	public void doCheckOut(String name) {
		for(int i=0;i<st.size();i++) {
			if(st.get(i).getvideo().equals(name)) {
				st.get(i).doCheckout();
				System.out.println("Video \""+name+"\" checked out successfully.\n");
			}
		}
	}
	public void doReturn(String name) {
		for(int i=0;i<st.size();i++) {
			if(st.get(i).getvideo().equals(name)) {
				st.get(i).doReturn();
				System.out.println("Video \""+name+"\" returned successfully.\n");
			}
		}
		
	}
	public void receiveRating(String name,int rating) {
		for(int i=0;i<st.size();i++) {
			if(st.get(i).getvideo().equals(name)) {
				st.get(i).receiveRating(rating);
				System.out.println("Rating \""+rating+"\" has been mapped to the video \""+name+"\".\n");
			}
		}
	}
	public void listInventory() {
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Video Name \t Checkout Status \t Rating");
		for(int i=0;i<st.size();i++) {
			System.out.println(st.get(i).getvideo()+"\t\t"+st.get(i).getCheckout()+"\t\t"+st.get(i).getRating());
		}
		System.out.println("-----------------------------------------------------------------------");
	}
}
