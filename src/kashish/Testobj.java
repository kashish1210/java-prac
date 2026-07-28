package kashish;
class TestNew{
	public void call()
	{
		System.out.println("Hi from call method");
	}
}

public class Testobj {
	public static void main(String[] args) {
		TestNew obj=new TestNew();
		obj.call();
		System.out.println("Test");
	}

}
