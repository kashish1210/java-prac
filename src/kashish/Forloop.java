package kashish;
class Range{
	public void testcount() {
		int i;
		int count=0;
		int count3=0;
		int count4=0;
		for(i=20;i<=40;i++) {
			if(i%2==0) {
				count++;
			}
			 if(i%3==0) {
				count3++;
			 }
			 if(i%4==0) {
				count4++;
				
			}
		}
		System.out.println(count+"/ by 2");
		
	}
}

public class Forloop {
	public static void main(String[] args) {
		Range range=new Range();
		range.testcount();
		
	}

}
