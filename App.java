import java.util.*;

public class App{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Welcome to Quotation App. Please enter the number corresponding to your product choice.");
            System.out.println("1. Air");
            System.out.println("2. Ocean");
            System.out.println("3. Land");
            System.out.print("Selection: ");
            
            int product = sc.nextInt();
            if (product == 3) {
                System.out.println("Sorry, the selected product is currently not available. Please choose a different option.");
                break;
            } else if (product == 2) {
                rateOutputOcean();
            } else if (product == 1) {
                rateOutputAir();
            } else {
                System.out.println("Sorry, you have entered an invalid option. Please try again.");
                product = sc.nextInt();
                sc.nextLine();
            }

            if(toExit()) {
                break;
            }
        }

        System.out.println("Thank you very much and have a nice day! :)");
        sc.close();
    }
    
    private static void rateOutputAir(){
            Scanner sc = new Scanner(System.in);
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
            System.out.printf("The price for your option is: $%.2f\n", weight * rate);
        }

    private static void rateOutputOcean(){
        Scanner sc = new Scanner(System.in);
        System.out.println("You have selected 'Ocean'.");
            System.out.print("Enter Volume: ");
            double volume = sc.nextDouble();
            sc.nextLine();
            System.out.println("Select Unlocode (Please choose a number from 1 to 3):");
            System.out.println("1. CNSHA - DEHAM (AP to North Europe)");
            System.out.println("2. SGSIN - USLAX (AP to North America West Coast)");
            System.out.println("3. Others");
            int no = sc.nextInt();
            sc.nextLine();
            while(no < 0 || no > 3){
                System.out.println("Select Region (Please choose a number from 1 to 3):");
                no = sc.nextInt();
            }
            int rate = 0;
            int rateArr[] = {920, 1093, 1000};
            rate = rateArr[rate];
            switch(no){
                case 0:
                rate = 920;
                break;
                case 1:
                rate = 1093;
                break;
                case 2:
                rate = 1000;
                break;
            }
            System.out.printf("The price for your option is: $%.2f\n", volume * rate);
    }

    private static boolean toExit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you wish to calculate again?(Y/N)");
        String input = sc.nextLine();
        while(!(input.equals("Y") || input.equals("N") || input.equals("y") || input.equals("n"))) {
            System.out.println("Invalid input.");
            System.out.println("Do you wish to calculate again?(Y/N)");
            input = sc.nextLine();
        } 
        if(input.equals("N") || input.equals("n")) {
            return true;
        }
        return false;
    }
}