package ex06;

public class Speaker1 {
	   
	   private boolean button;
	   private int volume;
	   
	   Speaker1(int volume) {
	      button = true;
	      this.volume = volume;
	   }
	   
	   public void on() {
	      button = true;
	      System.out.println("전원이 켜졌습니다");
	   }
	   
	   public void off() {
	      button = false;
	      System.out.println("전원이 꺼졌습니다");
	   }
	   
	   public void volumeUp() {
	      volume++;
	      System.out.println("볼륨 : " + volume);
	   }
	   
	   public void volumeDown() {
	      volume--;
	      System.out.println("볼륨 : " + volume);
	   }


	}