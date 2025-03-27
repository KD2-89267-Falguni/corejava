import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no : ");
		no=sc.nextInt();
		
		Integer i= new Integer(no);
		String str =i.toString();
		String b =i.toBinaryString(i);
		System.out.println(b);
		
		String c =i.toOctalString(i);
		System.out.println(c);
		
		String e =i.toHexString(i);
		System.out.println(e);


		
		

		

		
		

	}

}
