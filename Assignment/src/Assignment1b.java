import java.util.Scanner;

public class Assignment1b {

	public static void main(String[] args) {
		double a;
		double b;
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter first no : ");
         if(sc.hasNextDouble()) {
         a =sc.nextDouble();
         System.out.print("Enter second no : ");
         if(sc.hasNextDouble()) {
         b = sc.nextDouble();
         
         double average=(a+b)/2;
         System.out.println("Average = "+ average);
         
         }else {
        	 System.out.println("Your value is not double");
         }
      }
	else {
         
       System.out.println("System Terminated");
	}
	}

}
