package ex07;

public class music extends Speaker {

	   public music() {
	   }

	   @Override
	   public void powerOn() {
	      System.out.println("전원on.");
	   }
	   
	   @Override
	   public void powerOff() {
	      System.out.println("전원off.");
	   }
	   
	   @Override
	   public void soundUp() {
	      System.out.println("사운드up.");
	   }
	   
	   @Override
	   public void soundDown() {
	      System.out.println("사운드down.");
	   }
	   
	}
