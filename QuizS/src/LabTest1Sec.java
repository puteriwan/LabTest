import java.util.Scanner;
public class LabTest1Sec {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
    System.out.print("Enter sales: ");
    double sales = sc.nextDouble();
    
    System.out.print("Enter hours worked: ");
	int hour = sc.nextInt();
	
	double commission = 0;
	if (sales>=150 && sales<=300) {
		commission = (sales * 5)/100;
	} 
	else if (sales>=301 && sales<=500) {
		commission = (sales * 10)/100;
	} 
	else if (sales > 500) {
		commission = (sales * 15)/100;
	}
	
	double total, daily;
	
	total = hour * 5;
	daily = total +commission;
	
	System.out.println();
	System.out.println("Commission : RM" + commission);
	System.out.println("Daily Wages: RM" + daily);
    
	sc.close();

	}

}
