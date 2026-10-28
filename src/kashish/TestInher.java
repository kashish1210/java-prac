package kashish;
class Car{
	int a=20;
	public void fourTyres() {
		System.out.println("I have four tyres");
		
	}
}
class Santro extends Car{
	int b=10;
	public void powerWindows() {
		System.out.println("I have power windows");
	}
}
class BMW extends Santro{
	public void airBags() {
		System.out.println("I have air Bags");
		System.out.println("Without Objects:"+(a+b));
	}
}

public class TestInher {
	public static void main(String[] args) {
		//Car cr=new BMW();
		//BMW bm=new BMW();
		//bm.airBags();
		//Santro s=new BMW();
		BMW bm=new BMW();
		bm.airBags();
		//s.powerWindows();
		System.out.println("With objects:"+(bm.a+bm.b));
	}

}
