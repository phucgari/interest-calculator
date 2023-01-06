import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the initial amount: ");
        double money=scanner.nextDouble();
        System.out.println("Enter number of months: ");
        double month=scanner.nextDouble();
        System.out.println("Enter annual interest rate in percentage: ");
        double interest=scanner.nextDouble();
        double total= money*(interest/100)/12*month;
        System.out.println("Total of interest: "+total);
    }
}