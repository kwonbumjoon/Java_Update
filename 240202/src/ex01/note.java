package ex01;

public class note {
	public static void main(String[] args) {
		new Sample();
		new Sample();
		new Sample();
		new Sample();
		new Sample();
		System.out.println(Sample.count);
	}
	
	static class Sample{
	   static int count;
		   
	   public Sample() {
		   count++;
	   }
	}
}
