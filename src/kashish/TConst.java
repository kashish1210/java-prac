package kashish;
class School
{
	public School()
	{
		System.out.println("Called");
		show();//or we can also use School.show();
	}
	public void show()
	{
		System.out.println("Hii from show");
	}
}

public class TConst {
	public static void main(String[] args) {
		new School();
	}

}
