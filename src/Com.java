import java.util.ArrayList;
import java.util.Scanner;

class A{
	static int num;
	static String name, snm, con, sm;
}


public class Com extends A{
 
	public static void main(String[] args) {
		
		ArrayList<A> arr = new ArrayList<A>();
		
		
		
		Scanner input = new Scanner(System.in);

		for(;;) {
			System.out.println("1. 학생관리  2. 직원관리  3. 게시판 관리");
			System.out.print("숫자를 입력 : ");
			int num = input.nextInt();
			switch(num) {
			case 1: 
				
				break;
			case 2:
				String addr = null;
				int age = 0;
				String stNum = null;
				
				System.out.println("직원이름 입력");
				name = input.next();
				A n = new A();
				n.name="홍길동";
				n.addr="";
				n.age="홍길동";
				n.stNum="홍길동";
				
				arr.add(n);
				break;
		{
				
				
				
				
				
				
				
			case 3 :
				
				break;
			
			}
		}
	}

}
