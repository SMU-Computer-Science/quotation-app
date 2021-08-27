import java.util.*;

public class App{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Welcome to Quotation App. Please select your product:");
            System.out.println("1. Air");
            System.out.println("2. Ocean");
            System.out.println("3. Land");
            
            int product = sc.nextInt();
            if (product != 1) {
                System.out.println("Sorry, the selected product is not available. Please choose a different option.");
                product = sc.nextInt();
                sc.nextLine();
            }
            
            System.out.println("You have selected 'Air'.");
            System.out.print("Enter Weight: ");
            double weight = sc.nextDouble();
            sc.nextLine();
            System.out.println("Select Region (Please choose a number from 1 to 3):");
            System.out.println("1. AP-EU (AP to North Europe)");
            System.out.println("2. AP-NAWC (AP to North America West Coast)");
            System.out.println("3. Others");
            int no = sc.nextInt();
            sc.nextLine();
            while(no < 0 || no > 3){
                System.out.println("Select Region (Please choose a number from 1 to 3):");
                no = sc.nextInt();
            }
            int rate = 0;
            int rateArr[] = {8084, 15975, 10000};
            rate = rateArr[rate];
            switch(no){
                case 0:
                rate = 8084;
                break;
                case 1:
                rate = 15975;
                break;
                case 2:
                rate = 10000;
                break;
            }
            
            double price = weight * rate;
            System.out.println();
            System.out.printf("Price: $%.2f\n", price);
            
            System.out.println("Do you wish to calculate again?(Y/N)");
            String s = sc.nextLine();
            while(!(s.equals("Y") || s.equals("N"))) {
                System.out.println("Invalid input.");
                System.out.println("Do you wish to calculate again?(Y/N)");
                s = sc.nextLine();
            } 
            if(s.equals("N")) {
                break;
            }
        }

        System.out.println("Thank you very much and have a nice day! :)");
        sc.close();
    }
}