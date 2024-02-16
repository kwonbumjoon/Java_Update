package ex02;

import java.time.LocalDate;

public class Review {
	
	int reviewCount;
	LocalDate date;
	
	public Review(int reviewCount, LocalDate date) {
		this.reviewCount = reviewCount;
		this.date = date;
	}
	@Override
	public String toString() {
		return "Review [reviewCount=" + reviewCount + "," + "date=" + date + "]";
	}
	
	public int compareTo(Review o) {
		int x = this.reviewCount;
		int y = o.reviewCount;
//		return (x<y)? -1 : (x<y)? 1 : 0;
		return Integer.compare(x, y);
		
	}
	
	
}
