import java.util.Scanner;

public class Assignment1c {
	
	

	public static void main(String[] args) {
		int item;
		int quantity = 0;
		int total = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Dosa");
		System.out.println("2.vada");
		System.out.println("3.idli");
		System.out.println("4.sandwich");
		System.out.println("5.bhajiya");
		System.out.println("Enter your choice : ");
		item= sc.nextInt();

		int Menu = item;
		switch(item) {
		case 1:
			 System.out.println("dosa");
		 System.out.println("enter the quantity : ");
		 quantity=sc.nextInt();
		 total= 10*quantity;
		 break;
		case 2:
			 System.out.println("vada");
		 System.out.println("Enter the quantity : ");
		 quantity=sc.nextInt();
		 total=20*quantity;
		 
		 break;
		case 3:
		 System.out.println("idli");
		 System.out.println("Enter the quantity");
		 quantity=sc.nextInt();
		 total=5*quantity;

		 break;
		case 4:
			 System.out.println("Sandwich");
			 System.out.println("select the quantity");
			 quantity=sc.nextInt();
			 total=10*quantity;
			 break;
		case 5:
			 System.out.println("bhajiya");
			 System.out.println("select the quantity");
			 quantity=sc.nextInt();
			 total=30*quantity;
			 break;
		 
		default:
		 System.out.println("We do not have your order");
		 break;
		}

		System.out.println("Generate Bill : ");
		System.out.println("Enter the quantity you have taken : ");
		quantity=sc.nextInt();
		System.out.println("Bill = "+total);
		
		 
		
		
		
	}
	
	

}
