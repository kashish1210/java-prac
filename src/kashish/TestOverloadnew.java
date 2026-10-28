package kashish;
class User{
	int x=10;
	public User() {
		System.out.println("Hii from constructor block");
		
	}
	public void show() {
		System.out.println("Hii from show");
	}
}
class Newuser extends User{
	public void show() {
		System.out.println("Hii from show from child class");
	}
}

public class TestOverloadnew {
	public static void main(String args[]) {
	User u=new Newuser();
	System.out.println(u.x);
	u.show();
	}

}
