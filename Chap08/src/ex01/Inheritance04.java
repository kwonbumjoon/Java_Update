package ex01;

public class Inheritance04 {
	public static void main(String[] args) {
		SubSon objSon = new SubSon();
		objSon.printSon();
		objSon.printFather();
		
		SubDaughter objDaughter = new SubDaughter();
		objDaughter.printDaughter();
		objDaughter.printFather();
	}
}
