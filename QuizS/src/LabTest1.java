import java.util.Scanner;
public class LabTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
				System.out.print("Enter the number of item: ");
				int numitem = sc.nextInt();
				
				int[] noitem = new int [numitem];
				int[] quanitem = new int [numitem];
				double price[] = new double [numitem];
				
				double disc=0 ;
				double total=0;
				double totaleach=0;
				double pricepaid=0;

				for (int i=0; i<noitem.length; i++) {
					System.out.print("Enter the price of the item: ");
					price[i] = sc.nextDouble();
					System.out.print("Enter the quantity of the item: ");
					quanitem[i] = sc.nextInt();
					System.out.println(" ");
					totaleach = price[i]*quanitem[i];
					total = totaleach + total;
					
				}
				
				if (total>=100) {
					disc = total * 0.2;
					pricepaid = total - disc;
				}
				else {
					disc = total * 0.1;
					pricepaid = total-disc;
				}
				
				System.out.println("Total price \t : RM" +total);
				System.out.println("Discount received: RM" +disc);
				System.out.println("Price to be paid : RM" + pricepaid);
				
				sc.close();
	}
}
