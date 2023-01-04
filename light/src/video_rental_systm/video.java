package video_rental_systm;

public class video {
	String videoname;
	boolean checkout;
	int rating;
	public  video(String name) {
		 this.videoname = name;
	}
	public String getvideo() {
		return videoname;
	}
	public void doCheckout() {
		this.checkout = true;
	}
	public void doReturn() {
		this.checkout = false;
	}
	
	public void receiveRating(int rating) {
		this.rating = rating;
	}
	public int getRating() {
		return rating;
	}
	public boolean getCheckout() {
		return checkout;
	}

	
}
