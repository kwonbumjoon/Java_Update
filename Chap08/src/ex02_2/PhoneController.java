package ex02_2;

public class PhoneController {
	public static void main(String[] args) {
//		Phone p = new Phone();
//		
//		SmartPhone sp = new SmartPhone();
//		
//		NewestPhone np = new NewestPhone();
		
//		Phone phone = new Phone("m1", "흰색");
//		
//		// 둘 다 같은 표현
//		System.out.println(phone.toString());
//		System.out.println(phone);
		
		SmartPhone sp = new SmartPhone(true);
		//Phone
		//SmartPhone(boolean wifi)
		System.out.println(sp.toString());
		//Phone [model=null, color=null]
		//SmartPhone [wifi=true]
		
	}
}
