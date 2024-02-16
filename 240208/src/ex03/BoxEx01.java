package ex03;

public class BoxEx01 {
	public static void main(String[] args) {
		
		Box<Integer> iBox = new Box<Integer>();

		iBox.set(123);
		int num = iBox.get();
		System.out.println(num);
		
		System.out.println("---------------------------");
		
		Box<Double> dBox = new Box<Double>();
		dBox.set(12.5);
		double dNum = dBox.get();
		System.out.println(dNum);
		
	}
}

class Box <T>{
	private T obj;
	void set(T obj){
		this.obj = obj;
	}
	T get() {
		return obj;
	}
}